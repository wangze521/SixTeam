package com.jk.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.LoginUserMapper;
import com.jk.model.LoginUser;
import com.jk.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Service(interfaceClass =LoginUserService.class)
public class LoginUserServiceImpl implements LoginUserService {

    @Autowired
    private LoginUserMapper mapper;

    @Override
    public List<LoginUser> findUserList() {
        return mapper.findUserList();
    }

    @Override
    public List<Map<String, Object>> queryUserAll() {
        return mapper.queryUserAll();
    }
}
