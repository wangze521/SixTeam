package com.jk.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.jk.model.LpbRiZhi;
import com.jk.model.LpbSheng;
import com.jk.model.UserModel;
import com.jk.model.fwt.UserBean;
import com.jk.service.LpbService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.awt.geom.AreaOp;

import javax.servlet.http.HttpSession;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Controller
public class LpbController {


    @Reference
    private LpbService service;



    /*
    * 省信用排名
    * */
     @RequestMapping("lpbquery")
     @ResponseBody
    public List<LpbSheng> lpbquery(Integer id,Integer sheng){
         return  service.lpbquery(id,sheng);

     }

     /*
     * 下拉列表框查询
     * */
     @RequestMapping("queryQu")
    @ResponseBody
    public List<LpbSheng> queryQu(){
         List<LpbSheng>  list = service.queryQu();
         return list;
     }
     /*
     * 登陆回显
     * */
     @RequestMapping("Lpbquerylogin")
    @ResponseBody
    public UserBean  Lpbquerylogin(Integer id){

         UserBean bean =  service.Lpbquerylogin(id);

         return  bean;
     }
     @RequestMapping("Lpbadd")
    @ResponseBody
    public void Lpbadd(UserModel model){

         service.Lpbadd(model);

     }
     @RequestMapping("Lpbmoginadd")
     @ResponseBody
    public void Lpbmoginadd(LpbRiZhi rizhi, HttpSession session) throws UnknownHostException {


       String name= (String) session.getAttribute("name");

         System.out.println("========================"+name);

         Runtime r = Runtime.getRuntime();

         Properties props = System.getProperties();

         InetAddress addr;

         addr = InetAddress.getLocalHost();

         String ip = addr.getHostAddress();

         Map<String, String> map = System.getenv();

        String userName = map.get("USERNAME");// 获取用户名

         String computerName = map.get("COMPUTERNAME");// 获取计算机名

         String userDomain = map.get("USERDOMAIN");// 获取计算机域名

         System.out.println("本地ip地址:    " + ip);//本地地址


         /* LpbRiZhi ss=new LpbRiZhi();*/

         rizhi.setMoginjiid(map.get("USERDOMAIN"));

         rizhi.setMoginname(map.get("USERNAME"));

         rizhi.setMongincao(name);


         rizhi.setMoginid(ip);


         service.Lpbmoginadd(rizhi);


     }

    @RequestMapping("Lpbquery")
    @ResponseBody
    public  HashMap<String,Object> Lpbquery(Integer page,Integer rows){
        return service.Lpbquery(page,rows);
    }

    @RequestMapping("Lpbqueryshezhi")
    @ResponseBody
    public  HashMap<String,Object> Lpbqueryshezhi(Integer page,Integer rows){
        return service.Lpbqueryshezhi(page,rows);
    }




}
