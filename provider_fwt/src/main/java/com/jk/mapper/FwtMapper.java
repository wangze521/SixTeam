package com.jk.mapper;

import com.jk.model.fwt.DeptBean;
import com.jk.model.fwt.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FwtMapper {

    int findUserCount(@Param("user") UserBean user);

    List<UserBean> findUserList(@Param("start") int start, @Param("rows") Integer rows, @Param("user") UserBean user);


    void addUser(UserBean user);

    void deleteUserByIds(String peopleId);

    UserBean queryById(Integer peopleId);

    void updateUser(UserBean user);

    UserBean queryUserName(String uname);
}
