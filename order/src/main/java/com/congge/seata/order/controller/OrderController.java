package com.congge.seata.order.controller;

import com.congge.seata.order.entity.Order;
import com.congge.seata.order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/create")
    public Order create(String goodsCode , Integer quantity , String username , Integer points, Float amount ){
        return orderService.createOrder(goodsCode,quantity,username,points,amount);
    }
}
