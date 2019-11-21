package com.jk.controller;
import com.alibaba.dubbo.config.annotation.Reference;


import com.jk.model.InstaModel;
import com.jk.service.LmyService;
import com.jk.util.FileUtil;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import java.util.*;

@Controller
@RequestMapping("url")
public class InstallController {

    @Reference
    private LmyService service;

    @RequestMapping("toadd")
    public String toadd(){

        return "instalmy";
    }

  @RequestMapping("toaList")
    public String toaList(){

        return "instalmys";
    }


    //新增
    @RequestMapping("addInstall")
    @ResponseBody
    public void addInstall(InstaModel install){

        service.addInstall(install);
    }
    //图片
    @RequestMapping("upload")
    @ResponseBody
    public Map upload(MultipartFile file, HttpServletRequest request){
        HashMap<String, Object> result = new HashMap<>();
        String fileUpload = FileUtil.FileUpload(file, request);
        result.put("img", fileUpload);
        return result;

    }



    @RequestMapping("querylmy")
    @ResponseBody
    public Map queryInstall(Integer page, Integer rows, InstaModel install, HttpSession session, HttpServletRequest request){

        return service.queryInstall(page,rows,install);

    }

    //修改
   @RequestMapping("findByid")
   @ResponseBody
   public void  findByid(InstaModel lmy,Integer id){


         service.findByid(lmy,id);
   }


 /*
    @RequestMapping("lmyquery")
    @ResponseBody
    public InstaModel lmyquery(Integer id){

        InstaModel bean=service.lmyquery(id);

        return bean;
    }*/

//回显
    @RequestMapping("lmyquery1")
    @ResponseBody
    public InstaModel lmyquery1(Integer id){

        return service.lmyquery1(id);

    }









}
