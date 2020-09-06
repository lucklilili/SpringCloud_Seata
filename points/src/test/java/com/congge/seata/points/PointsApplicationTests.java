package com.congge.seata.points;

import com.congge.seata.points.service.PointsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PointsApplicationTests {
    @Resource
    private PointsService pointsService;

    @Test
    public void testPoints(){
        pointsService.increase("zhangsan", 10);
    }
}
