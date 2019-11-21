package com.jk.mapper;

import com.jk.model.LpbSheng;
import com.jk.model.UserBean;
import com.jk.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
@Mapper
public interface LpbMapper {
    /*
    * 省排名
    * */
    /*@Select("select p.jiamengshu ,p.id ,p.sheng,p.zonghefen from  lpb_province p  LEFT JOIN lpb_shi l on p.pid=l.shiid where p.typeid=1\n" +
            "group by p.zonghefen  ")*/
    List<LpbSheng> lpbquery(@Param("id") Integer id,@Param("sheng") Integer sheng);


    List<LpbSheng> queryQu();

    /*@Select( "select * from login_user where uid=#{id}")*/
    UserBean Lpbquerylogin(Integer id);

    void Lpbadd(UserModel model);
}
