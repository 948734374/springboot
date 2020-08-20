package com.example.demo.mapper;

import com.example.demo.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper

public interface SysUserMapper {
    @Select("SELECT * FROM sys_user WHERE id = #{id}")
    SysUser selectById(Integer id);

    @Select("SELECT * FROM sys_user WHERE name = #{name}")
    SysUser selectByName(String name);
}