package com.sharding.demo.dao;

import com.sharding.demo.model.PayOrder;
import org.apache.ibatis.annotations.Param;

public interface PayOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayOrder record);

    int insertSelective(PayOrder record);

    PayOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayOrder record);

    int updateByPrimaryKey(PayOrder record);

    PayOrder getByOrderNo(@Param("orderNo") String orderNo);
}