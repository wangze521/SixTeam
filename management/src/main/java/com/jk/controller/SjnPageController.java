package com.jk.controller;

import com.jk.service.SjnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class SjnPageController {


    @RequestMapping("totb")
    public String totb(){


        return "sjn/tianbao";
    }
    @RequestMapping("toquanbu")
    public String toquanbu(){

        return "sjn/quanbu";
    }
    @RequestMapping("totgsh")
    public String totgsh(){


        return "sjn/tgsh";
    }
    @RequestMapping("ytgwsh")
    public String ytgwsh(){


        return "sjn/ytgwsh";
    }
    @RequestMapping("wsh")
    public String wsh(){


        return "sjn/wsh";
    }

}
