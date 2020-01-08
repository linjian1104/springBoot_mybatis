package com.lin.service.impl;

import com.lin.entity.User;
import com.lin.service.UserService;

import java.util.Set;

/**
 * @author: liulei
 * @date: 2020/1/8 0008 下午 3:44
 * @describe:
 */
public class UserServiceImpl implements UserService {
    @Override
    public void changePassword(Long userId, String newPassword) {
        
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public Set<String> findRoles(String username) {
        return null;
    }

    @Override
    public Set<String> findPermissions(String username) {
        return null;
    }
}
