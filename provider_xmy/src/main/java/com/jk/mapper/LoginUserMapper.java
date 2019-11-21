package com.jk.mapper;

import com.jk.model.LoginUser;

import java.util.List;
import java.util.Map;

public interface LoginUserMapper {

    List<LoginUser> findUserList();

    List<Map<String, Object>> queryUserAll();
}