package com.hebut.ssm.manage.service.impl;


import com.hebut.ssm.manage.service.SysUserService;
import com.hebut.ssm.mapper.SysUserMapper;
import com.hebut.ssm.pojo.SysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Resource
	private SysUserMapper sysUserMapper;


	@Override
	public SysUser getById(Long id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}
}
