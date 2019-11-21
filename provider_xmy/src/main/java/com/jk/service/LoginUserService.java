package com.jk.service;

import com.jk.model.LoginUser;

import java.util.List;
import java.util.Map;

public interface LoginUserService {

    List<LoginUser> findUserList();

    List<Map<String, Object>> queryUserAll();
}
