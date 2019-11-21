package com.jk.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.TreeModelMapper;
import com.jk.service.ManagementService;
import com.jk.util.BootStrapTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
@Component
@Service(interfaceClass =ManagementService.class)
public class ManagementServiceImpl implements ManagementService {


     @Autowired
     private TreeModelMapper mapper;

    @Override
    public List<BootStrapTree> sync() {

         return mapper.sync();
    }
}
