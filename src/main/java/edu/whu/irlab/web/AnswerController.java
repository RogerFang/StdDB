package edu.whu.irlab.web;

import edu.whu.irlab.service.mysql.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Roger on 2016/7/22.
 */
@Controller
@RequestMapping("/answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @RequestMapping(method = RequestMethod.GET)
    public String answer(Model model){
        model.addAttribute("answer", answerService.selectByPrimaryKey(1));
        return "answer";
    }
}
