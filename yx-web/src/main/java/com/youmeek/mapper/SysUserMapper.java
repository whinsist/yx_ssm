package com.youmeek.mapper;


import com.youmeek.pojo.SysUser;
import com.youmeek.util.Criteria;

import java.util.List;
/**
 * @author Administrator
 */
public interface SysUserMapper {

    int insert(SysUser record);

    int insertSelective(SysUser record);

    int deleteByPrimaryKey(Long sysUserId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    SysUser selectByPrimaryKey(Long sysUserId);

    List<SysUser> selectByParams(Criteria criteria);

    List<SysUser> selectByIdList(Criteria criteria);
}