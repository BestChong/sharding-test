package com.sharding.demo.impl;

import com.sharding.demo.dao.PayOrderMapper;
import com.sharding.demo.model.PayOrder;
import com.sharding.demo.service.PayOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayOrderServiceImpl implements PayOrderService {

    @Autowired
    private PayOrderMapper payOrderMapper;

    @Override
    public PayOrder getByOrderNo(String orderNo) {
        return payOrderMapper.getByOrderNo(orderNo);
    }

    @Override
    public int addPayOrder(PayOrder payOrder) {
        return payOrderMapper.insertSelective(payOrder);
    }
}
