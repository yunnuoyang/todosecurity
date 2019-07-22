package com.codefaker.repository;

import com.codefaker.pojo.Permission;
import com.codefaker.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserRepository {
    @Select("select id,email from users ")
    @Results(
            value = {@Result(column = "id", property = "id"),
                    @Result(column = "email", property = "email")


            }
    )
    List<User> getAll();

    @Select("select * from users where username=#{username}")
    User findByUserName(@Param("username") String s);

//    @Select("select * from permission where username=#{arg0}")
//    List<Permission> findPermissionByUserName(String s);
}
