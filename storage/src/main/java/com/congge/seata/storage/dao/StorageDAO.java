package com.congge.seata.storage.dao;

import com.congge.seata.storage.entity.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StorageDAO {
    public Storage findByGoodsCode(String goodsCode);
    public void update(Storage storage);
}
