package com.ming.booksys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

    private Integer adminId; // 管理员 Id

    private String adminName; // 管理员名

    private String adminPwd; // 管理员密码

    private Integer adminLevel; // 管理员级别
}
