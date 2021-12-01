package com.durvisha.controller;

import com.durvisha.model.SessionUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")

public class UtilityController {

    @Autowired
    private SessionUser sessionUser;
    @GetMapping( value = "/getUtility")
    public String getUtilityMessage (ModelMap modelMap){

        modelMap.addAttribute("name", "Ashwin");
        sessionUser.setName("Ashiwin");
        return "Hello World";
    }
    @GetMapping( value = "/getName")
    public String getUtilityName (ModelMap modelMap){

       String name= (String) modelMap.getAttribute("name");

       name=sessionUser.getName();
        return "Hello "+name;
    }
}
