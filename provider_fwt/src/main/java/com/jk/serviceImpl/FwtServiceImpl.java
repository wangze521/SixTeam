package com.jk.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.DeptBeanMapper;
import com.jk.mapper.FwtMapper;
import com.jk.model.fwt.DeptBean;
import com.jk.model.fwt.UserBean;
import com.jk.service.FwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Component
@Service(interfaceClass =FwtService.class)
public class FwtServiceImpl implements FwtService {

    @Autowired
    private FwtMapper mapper;

    @Autowired
    private DeptBeanMapper mappera;
    @Override
    public UserBean queryUserName(String uname) {
        return mapper.queryUserName(uname);
    }

    @Override
    public HashMap<String, Object> findUserList(Integer page, Integer rows, UserBean user) {
        //查询总条数
        int total = mapper.findUserCount(user);
        //查询每页返回的数据 list
        int start = (page-1)*rows;
        List<UserBean> list = mapper.findUserList(start,rows,user);

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("total", total);
        map.put("rows", list);
        return map;
    }

    @Override
    public List findDeptList() {
        return mappera.findDeptList();
    }

    @Override
    public void addUser(UserBean user) {
        Integer id = user.getPeopleId();
        if(id!=null){
            mapper.updateUser(user);
        }else {
            mapper.addUser(user);
        }


    }

    @Override
    public void deleteUserByIds(String peopleId) {

         mapper.deleteUserByIds(peopleId);
    }

    @Override
    public UserBean queryById(Integer peopleId) {

        return mapper.queryById(peopleId);
    }

    @Override
    public HashMap<String, Object> findsDeptList(Integer page, Integer rows, DeptBean dept) {
        //查询总条数
        int total = mappera.findDeptCount(dept);
        //查询每页返回的数据 list
        int start = (page-1)*rows;
        List<UserBean> list = mappera.findsDeptList(start,rows,dept);

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("total", total);
        map.put("rows", list);
        return map;
    }

    @Override
    public void deleteDeptByIds(String deptId) {
        mappera.deleteDeptByIds(deptId);
    }

    @Override
    public void adddept(DeptBean dept) {
        Integer ids = dept.getDeptId();
        if (ids!=null){
            mappera.updatedept(dept);
        }else {
            mappera.adddept(dept);
        }


    }

    @Override
    public DeptBean queryDeptById(Integer deptId) {
        return mappera.queryDeptById(deptId);
    }


}
