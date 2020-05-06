package com.yang.cloud.order.dao;

import com.yang.cloud.order.entity.Advertisement;

/**
 * AdvertisementDAO继承基类
 */
public interface AdvertisementDAO{

    public Advertisement selectByPrimaryKey(long id);
}