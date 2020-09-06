package com.congge.seata.points.controller;

import com.congge.seata.points.entity.Points;
import com.congge.seata.points.service.PointsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PointsController {
    @Resource
    private PointsService pointsService;

    @GetMapping("/increase")
    public Points increase(String username, Integer quantity) {
        return pointsService.increase(username, quantity);
    }
}
