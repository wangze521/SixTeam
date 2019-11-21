package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.service.ManagementService;
import com.jk.util.BootStrapTree;
import com.jk.util.BootStrapTreeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("management")
public class TreeController {

     @Reference
     private ManagementService service;

    @RequestMapping("sync")

     public @ResponseBody List sync(){

        List<BootStrapTree> list = service.sync();

        list = BootStrapTreeUtil.getFatherNode(list);

        return list;

     }
     @RequestMapping("towz")
     public String towz(){


        return "tree";
     }










}
