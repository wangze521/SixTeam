package com.jk.service;


import com.jk.model.fwt.DeptBean;
import com.jk.model.fwt.UserBean;

import java.util.HashMap;
import java.util.List;

public interface FwtService {

    UserBean queryUserName(String uname);

    HashMap<String, Object> findUserList(Integer page, Integer rows, UserBean user);

    List findDeptList();

    void addUser(UserBean user);

    void deleteUserByIds(String peopleId);

    UserBean queryById(Integer peopleId);

    HashMap<String, Object> findsDeptList(Integer page, Integer rows, DeptBean dept);

    void deleteDeptByIds(String deptId);

    void adddept(DeptBean dept);

    DeptBean queryDeptById(Integer deptId);
}
