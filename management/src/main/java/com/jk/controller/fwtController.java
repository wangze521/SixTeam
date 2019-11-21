package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.jk.model.fwt.DeptBean;
import com.jk.model.fwt.UserBean;
import com.jk.model.fwt.user;
import com.jk.service.FwtService;
import com.jk.util.CheckImgUtil;
import com.jk.util.HttpClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Controller
public class fwtController {

    @Reference
    private FwtService service;

    /**
     * 验证码
     * @param request
     * @param response
     * @throws Exception
     */

    @RequestMapping("gainCode")
    private void gainCode(HttpServletRequest request, HttpServletResponse response) throws Exception {
        CheckImgUtil.checkImg(request,response);
    }

    /**
     * 登录
     * @param user
     * @param code
     * @param session
     * @return
     */
    @RequestMapping("login")
    @ResponseBody
    private String login(UserBean user, String code, HttpSession session){
        String checkcode = session.getAttribute("checkcode").toString();
        //验证验证码
        if(!code.equalsIgnoreCase(code)){
            return "验证码错误";
        }
        UserBean user2 = service.queryUserName(user.getUname());
        if (user2==null){
            return "用户名不存在";
        }
        //验证密码
        if (!user.getUpassword().equals(user2.getUpassword())){
            return "密码错误";
        }
        session.setAttribute("user",user2);
        session.setAttribute("id",user2.getUid());

        return "登录成功";
    }

    /**
     * 短信接口
     */

    @Autowired
    private RedisTemplate<String, String> redis;
    @RequestMapping("get")
    @ResponseBody
    public void get(String number){

        String url = "https://api.netease.im/sms/sendcode.action";
        Map<String, String> map = new HashMap<String, String>();
        map.put("mobile", number);
        map.put("templateid", "14836190");
        map.put("codeLen", "6");
        HttpClientUtil clientUtil = new HttpClientUtil();

        String str = clientUtil.doPost(url, map, "utf-8");

        user uu = JSONObject.parseObject(str,user.class);

        System.out.println(uu.getObj());

        String key=number;

        redis.opsForValue().set(key,uu.getObj());

        redis.expire(key,600, TimeUnit.SECONDS);

        System.out.println(str);

    }

    /**
     *短信登录
     * @param obj
     * @param
     * @return
     */
    @RequestMapping("loginQuick")
    @ResponseBody
    public String loginQuick(String obj,String number){


        String string = redis.opsForValue().get(number);



        if(obj.equals(string)) {

            return "1";
        }

        return "2";

    }

    /**
     * 查询
     * @param page
     * @param rows
     * @param user
     * @return
     */
    @RequestMapping("findUserList")
    @ResponseBody
    public  HashMap<String,Object> findUserList(Integer page,Integer rows,UserBean user){


        return service.findUserList(page,rows,user);
    }

    /**
     * 查询部门表
     * @return
     */
    @RequestMapping("findDeptList")
    @ResponseBody
    public List findDeptList(){

        List  list =  service.findDeptList();

        return list;
    }

    /**
     * 新增
     * @param user
     */
    @RequestMapping("addUser")
    @ResponseBody
    public void addUser(UserBean user){

        service.addUser(user);
    }

    /**
     * 删除
     * @param peopleId
     */
    @RequestMapping("deleteUserByIds")
    public @ResponseBody void deleteUserByIds(String peopleId){
        service.deleteUserByIds(peopleId);
    }

    /**
     * 回显
     * @param peopleId
     * @param model
     * @return
     */
    @RequestMapping("queryById")
    public String queryById(Integer peopleId, Model model){

        UserBean user = service.queryById(peopleId);
        model.addAttribute("user",user);

        return "fwt/updateUser";
    }

    /**
     * 部门查询
     * @param page
     * @param rows
     * @param dept
     * @return
     */
    @RequestMapping("findsDeptList")
    public @ResponseBody HashMap<String,Object> findsDeptList(Integer page,Integer rows,DeptBean dept){
        return service.findsDeptList(page,rows,dept);
    }

    /**
     * 部门删除
     * @param deptId
     */
    @RequestMapping("deleteDeptByIds")
    public @ResponseBody void deleteDeptByIds(String deptId){

        service.deleteDeptByIds(deptId);
    }

    @RequestMapping("adddept")
    public @ResponseBody void adddept(DeptBean dept){
        service.adddept(dept);
    }

    @RequestMapping("queryDeptById")
    public String queryDeptById(Integer deptId,Model model){
        DeptBean dept =  service.queryDeptById(deptId);
        model.addAttribute("dept",dept);
        return "fwt/updatedept";
    }
}
