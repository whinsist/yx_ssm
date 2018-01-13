package com.youmeek.service;

import com.youmeek.pojo.SysUser;
import com.youmeek.util.Criteria;

import java.util.List;

/**
 * @author Administrator
 */
public interface SysUserService {

	/**
	 * 增加用户
	 * @param user
	 * @return
	 */
	int add(SysUser user);

	/**
	 * 删除用户
	 */
	int delete(Long sysUserId);

	/**
	 * 跟新用户
	 * @param sysUser
	 * @return
	 */
	int update(SysUser sysUser);


	/**
	 * 获取用户
	 * @param id
	 * @return
	 */
	SysUser getById(Long id);

	/**
	 * ssssssssssss
	 * @param criteria
	 * @return
	 */
	List<SysUser> queryList(Criteria criteria);

}
