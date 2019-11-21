package com.jk.service;


import com.alibaba.fastjson.JSONObject;
import com.jk.model.LpbRiZhi;
import com.jk.model.LpbSheng;
import com.jk.model.LpbShi;
import com.jk.model.UserModel;
import com.jk.model.fwt.UserBean;

import java.util.HashMap;
import java.util.List;

public interface LpbService {


    List<LpbSheng> lpbquery(Integer id,Integer sheng);

    List<LpbShi> lpbshiquery();

    List<LpbSheng> queryQu();

    UserBean Lpbquerylogin(Integer id);

    void Lpbadd(UserModel model);

    void Lpbmoginadd(LpbRiZhi rizhi);

    HashMap<String, Object> Lpbquery(Integer page, Integer rows);

    HashMap<String, Object> Lpbqueryshezhi(Integer page, Integer rows);
}
