/**
 * FileName: LoginService
 * Author:   Administrator
 * Date:     2020/1/8 0008 下午 4:04
 * Description: linjian
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.lin.service;

import com.lin.entity.User;

public interface LoginService {
    public User getUserByName(String name);
}
