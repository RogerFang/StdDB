package edu.whu.irlab.web;

import edu.whu.irlab.model.local.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by Roger on 2016/7/21.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @ModelAttribute("user")
    public User initUser(){
        return new User();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String login(@ModelAttribute User user){
        return "account/login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String login(User user, RedirectAttributes redirectAttributes){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            System.out.println("UnknownAccountException");
            redirectAttributes.addFlashAttribute("user", user);
            redirectAttributes.addFlashAttribute("errMsg", "用户名不存在!");
            return "redirect:/login";
        }catch (IncorrectCredentialsException e){
            System.out.println("IncorrectCredentialsException");
            redirectAttributes.addFlashAttribute("user", user);
            redirectAttributes.addFlashAttribute("errMsg", "用户名/密码不正确!");
            return "redirect:/login";
        }catch (ExcessiveAttemptsException e){
            System.out.println("ExcessiveAttemptsException");
            redirectAttributes.addFlashAttribute("user", user);
            redirectAttributes.addFlashAttribute("errMsg", "尝试登陆次数过多!");
            return "redirect:/login";
        }

        // 验证通过后
        if (subject.isAuthenticated()){
            // String url = WebUtils.getSavedRequest(request).getRequestUrl();
            System.out.println("验证通过!  ");
            return "redirect:/";
        }else {
            return "redirect:/login";
        }
    }
}
