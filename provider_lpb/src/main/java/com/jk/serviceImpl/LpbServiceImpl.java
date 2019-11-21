package com.jk.serviceImpl;

import com.alibaba.dubbo.common.json.JSONObject;
import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.LpbMapper;
import com.jk.model.LpbRiZhi;
import com.jk.model.LpbSheng;
import com.jk.model.UserBean;
import com.jk.model.UserModel;
import com.jk.service.LpbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import sun.security.krb5.internal.ccache.FileCredentialsCache;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
@Component
@Service(interfaceClass =LpbService.class)
public class LpbServiceImpl implements LpbService {

    @Autowired
    private LpbMapper Lmapper;
    @Autowired
    private MongoTemplate  mongoTemplate;

    /*
    * 省排名
    * */
    @Override
    public List<LpbSheng> lpbquery(Integer id,Integer sheng) {

        return Lmapper.lpbquery(id,sheng);
    }
    /*
    * 下拉列表
    * */
    @Override
    public List<LpbSheng> queryQu() {
        return Lmapper.queryQu();
    }

    @Override
    public UserBean Lpbquerylogin(Integer id) {

        return Lmapper.Lpbquerylogin(id);
    }

    @Override
    public void Lpbadd(UserModel model) {


        Lmapper.Lpbadd(model);
    }

    @Override
    public void Lpbmoginadd(LpbRiZhi rizhi) {

        rizhi.setMogindate(new Date());
        mongoTemplate.save(rizhi);
    }

    @Override
    public HashMap<String, Object> Lpbquery(Integer page, Integer rows) {
        HashMap<String, Object> map = new HashMap<String, Object>();


        Query query = new Query();

        //查询分页
        long count = mongoTemplate.count(query , LpbRiZhi.class);

        //把值存到map里
        map.put("total", count);

        //开始条数
        query.skip((page-1)*rows);

        //每页多少条
        query.limit(rows);

        List<LpbRiZhi> find = mongoTemplate.find(query, LpbRiZhi.class);

        map.put("rows", find);

        return map;
        }

    @Override
    public HashMap<String, Object> Lpbqueryshezhi(Integer page, Integer rows) {
        HashMap<String, Object> map = new HashMap<String, Object>();


        Query query = new Query();

        //查询分页
        long count = mongoTemplate.count(query , LpbRiZhi.class);

        //把值存到map里
        map.put("total", count);

        //开始条数
        query.skip((page-1)*rows);

        //每页多少条
        query.limit(rows);

        List<LpbRiZhi> find = mongoTemplate.find(query, LpbRiZhi.class);

        map.put("rows", find);

        return map;
    }


}
