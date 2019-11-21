package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("page")
public class pageController {


    @RequestMapping("totree")
    public   String    totree(){
        return   "tree";
    }
    @RequestMapping("tologinQuick")
    public String tologinQuick(){
        return "loginQuick";
    }
    @RequestMapping("toindex")
    public String toindex(){
        return "index";
    }
    @RequestMapping("touserlist")
    public String touserlist(){
        return "fwt/userlist";
    }
    @RequestMapping("toAdd")
    public String toAdd(){
        return "fwt/addUser";
    }
    @RequestMapping("todeptlist")
    public String todeptlist(){
        return "fwt/deptlist";
    }
    @RequestMapping("toAdddept")
    public String toAdddept(){
        return "fwt/adddept";
    }

}
