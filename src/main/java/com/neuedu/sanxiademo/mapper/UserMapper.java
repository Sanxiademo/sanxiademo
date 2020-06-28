package com.neuedu.sanxiademo.mapper;

import com.neuedu.sanxiademo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modified,avatar_url,phone,password) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatar_url},#{phone},#{password})")
    void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);
}