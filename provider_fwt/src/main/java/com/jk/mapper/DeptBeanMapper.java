package com.jk.mapper;


import com.jk.model.fwt.DeptBean;
import com.jk.model.fwt.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptBeanMapper {

    List findDeptList();

    int findDeptCount(@Param("dept") DeptBean dept);

    List<UserBean> findsDeptList(@Param("start") int start, @Param("rows") Integer rows, @Param("dept") DeptBean dept);

    void deleteDeptByIds(String deptId);

    void adddept(DeptBean dept);

    DeptBean queryDeptById(Integer deptId);

    void updatedept(DeptBean dept);
}