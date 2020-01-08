package com.lin.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: liulei
 * @date: 2020/1/8 0008 下午 3:28
 * @describe:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Resource {
    private int id;
    private String name;
    private String type;
    private  int priority;
    private int parent_id;
    private  String parent_ids;
    private int available;
}
