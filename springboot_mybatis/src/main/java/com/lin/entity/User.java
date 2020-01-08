package com.lin.entity;

import lombok.*;

import java.util.Set;

/**
 * @author: liulei
 * @date: 2020/1/8 0008 下午 3:40
 * @describe:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private String    id;
    private String    userName;
    private String    password;
    /**
     * 用户对应的角色集合
     */
    private Set<Role> roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
