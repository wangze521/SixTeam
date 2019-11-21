package com.jk.service;

import com.jk.model.InstaModel;


import java.util.Map;

public interface LmyService {
    void addInstall(InstaModel install);
    Map queryInstall(Integer page, Integer rows, InstaModel install);
//    InstaModel lmyquery(Integer id);
    InstaModel lmyquery1(Integer id);
    void findByid(InstaModel lmy,Integer id);

}
