package com.jk.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.TianBaoMapper;


import com.jk.model.Sjn.Sc;
import com.jk.service.SjnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Service(interfaceClass = SjnService.class)
public class SjnServiceImpl implements SjnService{
    @Autowired
    private TianBaoMapper mapper;

    @Override
    public void add(Sc tb) {

        mapper.add(tb);
    }

    @Override
    public List querySheng() {
        return mapper.querySheng();
    }

    @Override
    public List getshi(Integer pid) {
        return mapper.getshi(pid);
    }

    @Override
    public List getqu(Integer pid) {
        return mapper.getqu(pid);
    }

    @Override
    public Map findList(Integer page, Integer rows, Sc sc) {
        HashMap<String, Object> result = new HashMap<>();
        //查询count
        int count = mapper.findCount(sc);
        result.put("total", count);
        //查询list
        Integer start = (page-1)*rows;
        List<Sc> books = mapper.findList(start,rows,sc);
        result.put("rows", books);
        return result;
    }

    @Override
    public Map tgsh(Integer page, Integer rows, Sc sc) {
        HashMap<String, Object> result = new HashMap<>();
        //查询count
        int count = mapper.findCounttwo(sc);
        result.put("total", count);
        //查询list
        Integer start = (page-1)*rows;
        List<Sc> books = mapper.tgsh(start,rows,sc);
        result.put("rows", books);
        return result;
    }

    @Override
    public Map ytgwsh(Integer page, Integer rows, Sc sc) {
        HashMap<String, Object> result = new HashMap<>();
        //查询count
        int count = mapper.findCountthree(sc);
        result.put("total", count);
        //查询list
        Integer start = (page-1)*rows;
        List<Sc> books = mapper.ytgwsh(start,rows,sc);
        result.put("rows", books);
        return result;
    }

    @Override
    public Map wsh(Integer page, Integer rows, Sc sc) {
        HashMap<String, Object> result = new HashMap<>();
        //查询count
        int count = mapper.findCountfour(sc);
        result.put("total", count);
        //查询list
        Integer start = (page-1)*rows;
        List<Sc> books = mapper.wsh(start,rows,sc);
        result.put("rows", books);
        return result;
    }

    @Override
    public void xiuthree(Integer id) {
         mapper.xiuthree(id);
    }

    @Override
    public void xiutwo(Integer id) {
        mapper.xiutwo(id);
    }

    @Override
    public Sc queryById(Integer id) {
        return mapper.queryById(id);
    }


}
