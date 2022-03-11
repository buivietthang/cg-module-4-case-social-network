package com.example.casesocialnetwork.controller;

import com.example.casesocialnetwork.model.AppUser;
import com.example.casesocialnetwork.model.Role;
import com.example.casesocialnetwork.service.appUserService.AppUserService;
import com.example.casesocialnetwork.service.roleService.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class HomeController {
    @Autowired
    private AppUserService appUserService;

    @Autowired
    private RoleService roleService;

    @GetMapping("khongcoquyen")
    public String accessDenied(){
        return "khongcoquyen";
    }

    @GetMapping("/")
    public ModelAndView login1(){
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public ModelAndView showRegisterForm(){
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("appUser",new AppUser());
        return modelAndView;
    }

    @PostMapping("/register")
    public ModelAndView createNewUser(@Validated @ModelAttribute("appUser") AppUser appUser, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("register");
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("login");
        Optional<Role> role = roleService.findById((long)2);
        appUser.setRole(role.get());
        appUser.setIsActive("true");
        appUser.setCover("https://wallpapercave.com/wp/wp8155232.jpg");
        appUser.setAvatar("https://vn.portal-pokemon.com/play/resources/pokedex/img/pm/cf47f9fac4ed3037ff2a8ea83204e32aff8fb5f3.png");
        appUserService.save(appUser);
        modelAndView.addObject("appUser",appUser);
        return modelAndView;
    }
}
