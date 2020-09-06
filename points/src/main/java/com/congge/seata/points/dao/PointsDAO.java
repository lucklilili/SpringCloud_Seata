package com.congge.seata.points.dao;


import com.congge.seata.points.entity.Points;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PointsDAO {
    public Points findByUsername(String username);
    public void update(Points points);
}
