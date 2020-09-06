package com.congge.seata.bussiness.controller;

import com.congge.seata.bussiness.client.entity.Order;
import com.congge.seata.bussiness.service.BussinessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BussinessController {
    @Resource
    private BussinessService bussinessService;
    @GetMapping("/test1")
    public Order test1(){
        return bussinessService.sale("coke",10,"zhangsan",3,30f);
    }
    @GetMapping("/test2")
    public Order test2(){
        return bussinessService.sale("coke",10000,"zhangsan",3000,30000f);
    }
}
