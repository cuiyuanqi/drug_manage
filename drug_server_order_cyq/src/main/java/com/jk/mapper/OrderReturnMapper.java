package com.jk.mapper;

import com.jk.pojo.OrderReturn;

import java.util.List;

public interface OrderReturnMapper {
    /**
     *查询退货订单信息
     * @return
     */
    List<OrderReturn> queryOrderReturnlist();

    /**
     * 确认订单信息
     * @param orderId
     */
    void updateState(Integer orderId);
}
