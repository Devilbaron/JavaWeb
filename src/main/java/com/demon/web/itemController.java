package com.demon.web;

import com.demon.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class itemController{
    @RequestMapping("login")
    private ModelAndView login(User user){
        ModelAndView view = new ModelAndView();
        System.out.println(user.getUsername());
        view.setViewName("ok");
        view.addObject("user",user.getUsername());
        return view;
    }
}
