package com.sharding.demo.service;

import com.sharding.demo.model.PayOrder;

public interface PayOrderService {

    PayOrder getByOrderNo(String orderNo);

    int addPayOrder(PayOrder payOrder);
}
