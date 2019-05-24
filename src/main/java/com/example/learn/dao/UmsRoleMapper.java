package com.example.learn.dao;

import com.example.learn.pojo.UmsRole;


public interface UmsRoleMapper {
    int insert(UmsRole record);

    int insertSelective(UmsRole record);

    UmsRole selectUmsById(int id);
}