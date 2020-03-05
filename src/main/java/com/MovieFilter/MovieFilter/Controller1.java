package com.MovieFilter.MovieFilter;

import com.MovieFilter.MovieFilter.Model.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Controller1 {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginForm(){
        return "login";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model){
        String username=loginForm.getUsername();
        String password=loginForm.getPassword();
        if(username.compareTo("admin")==0&&password.compareTo("admin")==0)
        {
            return "Home";
        }
        model.addAttribute("invalidCredentials",true);
        return "login";
    }
}
