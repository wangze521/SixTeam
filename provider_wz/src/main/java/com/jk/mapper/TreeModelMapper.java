package com.jk.mapper;

import com.jk.model.TreeModel;
import com.jk.util.BootStrapTree;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TreeModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TreeModel record);

    int insertSelective(TreeModel record);

    TreeModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TreeModel record);

    int updateByPrimaryKey(TreeModel record);

    @Select("select * from  tree")
    List<BootStrapTree> sync();
}