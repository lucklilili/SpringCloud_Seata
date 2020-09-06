package com.congge.seata.storage.service;

import com.congge.seata.storage.dao.StorageDAO;
import com.congge.seata.storage.entity.Storage;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 仓库服务
 */
@Service
public class StorageService {

    @Resource
    private StorageDAO storageDAO;

    /**
     * 减少库存
     * @param goodsCode 商品编码
     * @param quantity 减少数量
     * @return 库存对象
     */
    public Storage decrease(String goodsCode, Integer quantity) {
        Storage storage = storageDAO.findByGoodsCode(goodsCode);
        if (storage.getQuantity() >= quantity) {
            storage.setQuantity(storage.getQuantity() - quantity);
        }else{
            throw new RuntimeException(goodsCode + "库存不足,目前剩余库存:" + storage.getQuantity() );
        }
        storageDAO.update(storage);
        return storage;
    }
}
