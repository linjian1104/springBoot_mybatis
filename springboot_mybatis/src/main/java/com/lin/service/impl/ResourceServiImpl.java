package com.lin.service.impl;

import com.lin.entity.Resource;
import com.lin.service.ResourceServic;

import java.util.List;
import java.util.Set;

/**
 * @author: liulei
 * @date: 2020/1/8 0008 下午 3:37
 * @describe:
 */
public class ResourceServiImpl implements ResourceServic {
    @Override
    public Set<String> findPermissions(Set<Long> resourceIds) {
        return null;
    }

    @Override
    public List<Resource> findMenus(Set<String> permissions) {
        return null;
    }
}
