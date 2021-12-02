package com.durvisha.controller;

import com.durvisha.component.SessionUser;
import com.durvisha.service.LoginUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v1")
public class LoginController {

    @Autowired
    private SessionUser sessionUser;
    @Autowired
    private LoginUserDetailService loginUserDetailService;
    @GetMapping( value = "/getUtility")
    public String getUtilityMessage (ModelMap modelMap){

        modelMap.addAttribute("name", "Ashwin");
        sessionUser.setName("Ashiwin");

        sessionUser.setCustomLoginUser(loginUserDetailService.loggingUser("systemdmin",1));
        return "Hello World";
    }
    @GetMapping( value = "/getName")
    public String getUtilityName (ModelMap modelMap){

       String name= (String) modelMap.getAttribute("name");

       if (sessionUser.getCustomLoginUser().getUserId()!=null){
           name=sessionUser.getName();
       }else {
           throw new RuntimeException();



       }

        return "Hello "+name;
    }
}
