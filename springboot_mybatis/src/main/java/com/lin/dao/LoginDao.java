/**
 * FileName: LoginDao
 * Author:   Administrator
 * Date:     2020/1/8 0008 下午 4:03
 * Description: linjian
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.lin.dao;

import com.lin.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface LoginDao {
    public User getUserByName(String name);


}
