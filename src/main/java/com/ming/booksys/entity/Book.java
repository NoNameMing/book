package com.ming.booksys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private String bookId; // 编号

    private String bookName; // 书名

    private String bookDesc; // 图书描述

    private String bookImgAddr; // 图书图片地址

    private Integer bookStatus; // 图书状态

    private Integer bookAuthId; // 图书作家 Id

    private Integer bookCategoryId; // 图书所属分类 Id

    private Integer bookAreaId; // 图书区域 Id
}
