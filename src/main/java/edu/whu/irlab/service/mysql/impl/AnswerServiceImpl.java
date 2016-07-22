package edu.whu.irlab.service.mysql.impl;

import edu.whu.irlab.dao.mysql.AnswerMapper;
import edu.whu.irlab.model.mysql.Answer;
import edu.whu.irlab.service.mysql.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Roger on 2016/7/22.
 */
@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerMapper answerMapper;

    @Override
    public Answer selectByPrimaryKey(Integer id) {
        return answerMapper.selectByPrimaryKey(id);
    }
}
