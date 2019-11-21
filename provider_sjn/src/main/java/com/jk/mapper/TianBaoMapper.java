package com.jk.mapper;

import com.jk.model.Sjn.Sc;
import com.jk.model.Sjn.TianBao;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface TianBaoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TianBao record);

    int insertSelective(TianBao record);

    TianBao selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TianBao record);

    int updateByPrimaryKey(TianBao record);

    void add(Sc tb);

    List querySheng();

    List getshi(Integer pid);

    List getqu(Integer pid);



    int findCount(@Param("sc") Sc sc);


    List<Sc> findList(@Param("start") Integer start,@Param("rows") Integer rows,@Param("sc") Sc sc);

    int findCounttwo(@Param("sc")Sc sc);

    List<Sc> tgsh(@Param("start") Integer start,@Param("rows") Integer rows,@Param("sc") Sc sc);

    int findCountthree(@Param("sc")Sc sc);

    List<Sc> ytgwsh(@Param("start") Integer start,@Param("rows") Integer rows,@Param("sc") Sc sc);

    int findCountfour(@Param("sc")Sc sc);
    List<Sc> wsh(@Param("start") Integer start,@Param("rows") Integer rows,@Param("sc") Sc sc);

    void xiuthree(Integer id);

    void xiutwo(Integer id);

    Sc queryById(Integer id);
}