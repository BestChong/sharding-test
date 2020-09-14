package com.sharding.demo.controller;

import com.sharding.demo.model.PayOrder;
import com.sharding.demo.service.PayOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PayOrderController {

    @Autowired
    private PayOrderService payOrderService;

    @GetMapping("/get/pay_order")
    @ResponseBody
    public PayOrder getPayOrder(@RequestParam("orderNo") String orderNO) {
        return payOrderService.getByOrderNo(orderNO);
    }

    @PostMapping("/add.pay.order")
    public String addPayOrder(@RequestBody PayOrder payOrder){
        payOrderService.addPayOrder(payOrder);
        return "success";
    }
}
