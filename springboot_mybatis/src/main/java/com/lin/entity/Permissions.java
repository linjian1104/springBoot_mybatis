package com.lin.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: liulei
 * @date: 2020/1/8 0008 下午 4:02
 * @describe:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Permissions {
    private String id;
    private String permissionsName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermissionsName() {
        return permissionsName;
    }

    public void setPermissionsName(String permissionsName) {
        this.permissionsName = permissionsName;
    }
}
