package com.jk.service;


import com.jk.model.Sjn.Sc;
import com.jk.model.Sjn.TianBao;

import java.util.List;
import java.util.Map;


public interface SjnService {

    void add(Sc tb);




    List querySheng();

    List getshi(Integer pid);

    List getqu(Integer pid);

    Map findList(Integer page, Integer rows, Sc sc);

    Map tgsh(Integer page, Integer rows, Sc sc);

    Map ytgwsh(Integer page, Integer rows, Sc sc);

    Map wsh(Integer page, Integer rows, Sc sc);

    void xiuthree(Integer id);

    void xiutwo(Integer id);

    Sc queryById(Integer id);
}
