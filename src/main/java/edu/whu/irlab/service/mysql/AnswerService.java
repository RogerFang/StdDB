package edu.whu.irlab.service.mysql;

import edu.whu.irlab.model.mysql.Answer;

/**
 * Created by Roger on 2016/7/22.
 */
public interface AnswerService {
    Answer selectByPrimaryKey(Integer id);
}
