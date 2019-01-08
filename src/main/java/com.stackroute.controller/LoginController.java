package com.stackroute.controller;


import com.stackroute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @RequestMapping(value="/",method=RequestMethod.GET)
    public  ModelAndView login()
    {
      return new ModelAndView("login","command",new User());
    }


    @RequestMapping(value = "/submit",method=RequestMethod.POST)
    public String user(@ModelAttribute User user,ModelMap map) {
        map.addAttribute("user",user.getUsername());
        return "index";
    }
}
