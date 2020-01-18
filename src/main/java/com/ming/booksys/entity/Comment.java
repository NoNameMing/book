package com.ming.booksys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    private Integer commentId; // 评论 Id

    private Integer bookId; // 图书 Id

    private Integer readerId; // 用户 Id

    private String commentDetail; // 评论细节

    private Integer commentScore; // 评分打分
}
