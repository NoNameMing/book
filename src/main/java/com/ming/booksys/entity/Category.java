package com.ming.booksys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    private Integer bookCategoryId; // 图书分类 Id

    private String bookCategoryName; // 图书分类名

    private String bookCategoryDesc; // 图书分类描述

    private String bookCategoryImg; // 图书分类图片地址
}
