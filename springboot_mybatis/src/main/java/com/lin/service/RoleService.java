/**
 * FileName: RoleService
 * Author:   Administrator
 * Date:     2020/1/8 0008 下午 3:38
 * Description: linjian
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.lin.service;

import java.util.Set;

public interface RoleService {
    Set<String> findRoles(Long... roleIds); //根据角色编号得到角色标识符列表
    Set<String> findPermissions(Long[] roleIds); //根据角色编号得到权限字符串列表
}
