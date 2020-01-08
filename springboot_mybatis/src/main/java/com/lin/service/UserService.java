/**
 * FileName: UserService
 * Author:   Administrator
 * Date:     2020/1/8 0008 下午 3:39
 * Description: linjian
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.lin.service;

import com.lin.entity.User;

import java.util.Set;

public interface UserService {
    public void changePassword(Long userId, String newPassword); //修改密码
    public User findByUsername(String username); //根据用户名查找用户
    public Set<String> findRoles(String username);// 根据用户名查找其角色
    public Set<String> findPermissions(String username);// 根据用户名查找其权限
}
