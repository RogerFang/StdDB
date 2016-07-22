package edu.whu.irlab.aop;

import edu.whu.irlab.dao.AccessMysql;
import edu.whu.irlab.dao.LocalMapper;
import edu.whu.irlab.dao.MysqlMapper;
import edu.whu.irlab.datasource.MultipleDataSource;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Roger on 2016/7/22.
 */
@Component
@Aspect
public class MultipleDataSourceAspectAdvice {

    @Around("execution(* edu.whu.irlab.dao..*.*(..))")
    public Object doAround(ProceedingJoinPoint jp) throws Throwable {
        if (jp.getTarget() instanceof AccessMysql){
            MultipleDataSource.setDataSourceKey("dataSourceAccess");
        }else if (jp.getTarget() instanceof MysqlMapper){
            MultipleDataSource.setDataSourceKey("dataSourceMysql");
        }else if (jp.getTarget() instanceof LocalMapper){
            MultipleDataSource.setDataSourceKey("dataSourceLocal");
        }

        return jp.proceed();
    }
}
