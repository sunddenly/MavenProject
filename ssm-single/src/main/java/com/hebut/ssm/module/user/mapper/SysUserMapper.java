package com.hebut.ssm.module.user.mapper;


import com.hebut.ssm.module.user.pojo.SysUser;

public interface SysUserMapper {

    int deleteByPrimaryKey(Long sysUserId);
    int insert(SysUser record);
    int insertSelective(SysUser record);
    SysUser selectByPrimaryKey(Long sysUserId);
    int updateByPrimaryKeySelective(SysUser record);
    int updateByPrimaryKey(SysUser record);
}