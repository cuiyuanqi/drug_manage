package com.jk.service;

import com.jk.pojo.OrderReturn;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface OrderReturnServiceApi {
    /**
     * 查询退货订单信息
     * @return
     */
    @GetMapping("queryOrderReturnlist")
    List<OrderReturn> queryOrderReturnlist();

    /**
     * 确认订单信息
     * @param orderId
     */
    @PostMapping("updateState")
    void updateState(Integer orderId);
}
