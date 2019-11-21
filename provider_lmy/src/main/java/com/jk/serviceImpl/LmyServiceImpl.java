package com.jk.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.InstaModelMapper;
import com.jk.model.InstaModel;

import com.jk.model.fwt.UserBean;
import com.jk.service.LmyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.net.ssl.SSLEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Service(interfaceClass = LmyService.class)
public class LmyServiceImpl implements LmyService {

    @Autowired
    private InstaModelMapper lmyMappermapper;

    @Override
    public void addInstall(InstaModel install) {

        lmyMappermapper.addInstall(install);

    }

    @Override
    public Map queryInstall(Integer page, Integer rows, InstaModel install) {
        HashMap<String, Object> result=new HashMap<>();

        int count =lmyMappermapper.findCount(install);

        Integer start=(page-1)*rows;
        List<InstaModel> user=lmyMappermapper.queryInstall(start,rows,install);
        result.put("rows", user);
        result.put("total", count);
        return result;
    }

    /*@Override
    public InstaModel lmyquery(Integer id) {
        return lmyMappermapper.lmyquery(id);
    }*/

    @Override
    public InstaModel lmyquery1(Integer id) {
        return lmyMappermapper.lmyquery1(id);
    }

    @Override
    public void findByid(InstaModel lmy,Integer id) {
         lmyMappermapper.findByid(lmy,id);
    }


}
