package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.Sjn.Sc;
import com.jk.service.SjnService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("sjn")
public class SjnController {

    @Reference
    private SjnService service;

    /**
     * 新增填报信息
     * @param tb
     */
    @RequestMapping("add")
    @ResponseBody
    public void addtianbao(Sc tb){
        service.add(tb);
    }

    /**\
     * 查询省
     * @return
     */
    @RequestMapping("querySheng")
    @ResponseBody
    public List querySheng() {
        return service.querySheng();

    }

    /**
     * 查询市
     * @param pid
     * @return
     */

    @RequestMapping("getshi")
    @ResponseBody
    public List getshi(Integer pid){
        return service.getshi(pid);

    }

    /**
     * 查询区
     * @param pid
     * @return
     */

    @RequestMapping("getqu")
    @ResponseBody
    public List getqu(Integer pid){
        return service.getqu(pid);

    }

   @RequestMapping("findList")
    @ResponseBody
   public Map findBookList(Integer page, Integer rows, Sc sc) {
       return service.findList(page,rows,sc);
   }
    @RequestMapping("tgsh")
    @ResponseBody
    public Map tgsh(Integer page, Integer rows, Sc sc) {
        return service.tgsh(page,rows,sc);
    }

    @RequestMapping("ytgwsh")
    @ResponseBody
    public Map ytgwsh(Integer page, Integer rows, Sc sc) {
        return service.ytgwsh(page,rows,sc);
    }
    @RequestMapping("wsh")
    @ResponseBody
    public Map wsh(Integer page, Integer rows, Sc sc) {
        return service.wsh(page,rows,sc);
    }

    @RequestMapping("xiuthree")
    @ResponseBody
    public void xiuthree(Integer id){
         service.xiuthree(id);
    }
    @RequestMapping("xiutwo")
    @ResponseBody
    public void xiutwo(Integer id){
        service.xiutwo(id);
    }

    @RequestMapping("upda")
    @ResponseBody
    public String queryById(Integer id, HttpSession session){

        Sc sc =  service.queryById(id);

        session.setAttribute("sc",sc);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        String format = sdf.format(sc.getSdate());
        session.setAttribute("dat",format);
        System.out.println(session.getAttribute("dat"));


        return null;
    }

}
