package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class LpbPageController {

    /*
    * 系统页面
    * */
    @RequestMapping("xitong")
    public String xitong(){
        return "lpbxitong";
    }
    /*
    *首页
    * */
    @RequestMapping("lpbshoeye")
    public String lpbshoeye(){

        return "LpbShowYe";
    }

    /*
    * 账户页面
    * */
    @RequestMapping("Lpbzhanghu")
    public String Lpbzhanghu(){
        return "Lpbzhanghu";
    }
    /*
    * 登陆页面
    * */
    @RequestMapping("index")
    public String index(){
        return "index";
    }
    /*
    * 日志页面
    * */
    @RequestMapping("LpbRizhi")
    public String LpbRizhi(){
        return "LpbRizhi";
    }
    /*
    * 设置的操作日志
    * */
    @RequestMapping("Lpbcaozuo")
    public String Lpbcaozuo(){

        return "Lpbcaozuo";
    }
    /*
    * layui
    * */
    @RequestMapping("lpblayui")
    public String lpblayui(){

        return  "lpblayui";
    }





}
