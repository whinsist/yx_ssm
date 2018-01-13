package com.youmeek.service.impl;

import com.youmeek.mapper.SysUserMapper;
import com.youmeek.pojo.SysUser;
import com.youmeek.service.SysUserService;
import com.youmeek.util.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public int add(SysUser user) {
        return sysUserMapper.insert(user);
    }

    @Override
    public SysUser getById(Long id) {
        //查询用户
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(id);
        return sysUser;
    }

    @Override
    public List<SysUser> queryList(Criteria criteria) {
        //使用分页查询
        criteria.put("sysUserLoginName", "YouMeek");
        criteria.setDistinct(true);
        criteria.setMysqlOffset(0);
        criteria.setMysqlLength(1);
        List<SysUser> list = sysUserMapper.selectByParams(criteria);
        System.out.print("list.size = "+list.size());

        //mybatis in 查询
        List<Long> idList = new ArrayList<Long>();
        idList.add(1L);
        idList.add(2L);
        Criteria criteria2 = new Criteria();
        criteria2.put("ids", idList);
        List<SysUser> list2 = this.sysUserMapper.selectByIdList(criteria2);
        System.out.println(list2.size());
        return list;
    }

    @Override
    public int delete(Long sysUserId) {
        return this.sysUserMapper.deleteByPrimaryKey(sysUserId);
    }

    @Override
    public int update(SysUser sysUser) {
        return this.sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }


}
