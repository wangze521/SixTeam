package com.jk.mapper;

import com.jk.model.InstaModel;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InstaModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InstaModel record);

    int insertSelective(InstaModel record);

    InstaModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InstaModel record);

    int updateByPrimaryKey(InstaModel record);

    void addInstall( InstaModel install);

    int findCount(@Param("install") InstaModel install);

    List<InstaModel> queryInstall(@Param("start") Integer start,@Param("rows") Integer rows,@Param("install") InstaModel install);

/*
    InstaModel lmyquery(Integer id);
*/


    InstaModel lmyquery1(Integer id);

    void findByid(@Param("lmy")InstaModel lmy,@Param("id")Integer id);
}