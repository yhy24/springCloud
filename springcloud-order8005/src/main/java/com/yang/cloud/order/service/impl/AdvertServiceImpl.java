package com.yang.cloud.order.service.impl;

import com.yang.cloud.order.dao.AdvertisementDAO;
import com.yang.cloud.order.entity.Advertisement;
import com.yang.cloud.order.service.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdvertServiceImpl  implements AdvertService {

    @Autowired
    AdvertisementDAO advertisementDAO;

    @Override
    public Advertisement getById(long id) {
        return advertisementDAO.selectByPrimaryKey(id);
    }
}
