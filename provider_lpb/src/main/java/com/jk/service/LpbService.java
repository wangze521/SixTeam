package com.jk.service;


import com.alibaba.dubbo.common.json.JSONObject;
import com.jk.model.LpbRiZhi;
import com.jk.model.LpbSheng;
import com.jk.model.UserBean;
import com.jk.model.UserModel;

import java.util.HashMap;
import java.util.List;

public interface LpbService {
    List<LpbSheng> lpbquery(Integer id,Integer sheng);

    List<LpbSheng> queryQu();

    UserBean Lpbquerylogin(Integer id);

    void Lpbadd(UserModel model);

    void Lpbmoginadd(LpbRiZhi rizhi);

    HashMap<String, Object> Lpbquery(Integer page, Integer rows);

    HashMap<String, Object> Lpbqueryshezhi(Integer page, Integer rows);


}
