package com.example.demo.mapper;


import com.example.demo.entity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper

public interface SysUserRoleMapper {
    @Select("SELECT * FROM sys_user_role WHERE user_id = #{userId}")
    List<SysUserRole> listByUserId(Integer userId);
}