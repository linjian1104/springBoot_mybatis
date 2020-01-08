/**
 * FileName: ResourceServic
 * Author:   Administrator
 * Date:     2020/1/8 0008 下午 3:36
 * Description: linjian
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.lin.service;

import com.lin.entity.Resource;

import java.util.List;
import java.util.Set;

public interface ResourceServic {
    Set<String> findPermissions(Set<Long> resourceIds); //得到资源对应的权限字符串
    List<Resource> findMenus(Set<String> permissions); //根据用户权限得到菜单
}
