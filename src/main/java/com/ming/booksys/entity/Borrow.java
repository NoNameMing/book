package com.ming.booksys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Borrow {

    private Integer borrowId; // 借书 Id

    private Integer readerId; // 用户 Id

    private Integer bookId; // 图书 Id

    private Integer bookStatus; // 借还状态，0在借，1已还，2逾期

    private Timestamp borrowDate; // 借书日期

    private Timestamp returnDate; // 归还日期

    private Integer leftDays; // 剩余天数，默认 30

    private Integer overDays; // 逾期天数，默认 0

}
