package com.ming.booksys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reader {

    private Integer readerId; // 用户Id

    private String readerName; // 用户名

    private String readerGender; // 用户性别

    private String readerPhone; // 用户电话

    private String readerMail; // 用户邮箱

    private String readerImgAddr; // 用户头像地址

    private String readerPwd; // 用户密码
}
