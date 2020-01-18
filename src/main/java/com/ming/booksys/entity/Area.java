package com.ming.booksys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Area {

    private Integer areaId; // 区域 Id

    private String areaName; // 区域名

    private String areaLoc; // 区域具体位置
}
