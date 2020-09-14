package com.sharding.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class PayOrder {
    private Integer id;

    private Long amount;

    private String userId;

    private String orderNo;

    private Date ctime;

    private Date mtime;

}