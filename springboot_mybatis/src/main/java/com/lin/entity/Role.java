package com.lin.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Permissions;
import java.util.Set;

/**
 * @author: liulei
 * @date: 2020/1/8 0008 下午 4:01
 * @describe:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Role {

    private String           id;
    private String           roleName;
    /**
     * 角色对应权限集合
     */
    private Set<Permissions> permissions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<Permissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permissions> permissions) {
        this.permissions = permissions;
    }
}
