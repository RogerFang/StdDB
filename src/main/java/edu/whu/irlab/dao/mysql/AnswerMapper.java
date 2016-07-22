package edu.whu.irlab.dao.mysql;

import edu.whu.irlab.dao.MysqlMapper;
import edu.whu.irlab.model.mysql.Answer;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerMapper extends MysqlMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(Answer record);

    int insertSelective(Answer record);

    Answer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Answer record);

    int updateByPrimaryKeyWithBLOBs(Answer record);

    int updateByPrimaryKey(Answer record);
}