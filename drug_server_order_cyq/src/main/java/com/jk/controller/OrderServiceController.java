package com.jk.controller;

import com.jk.mapper.OrderReturnMapper;
import com.jk.pojo.OrderReturn;
import com.jk.service.OrderReturnServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class OrderServiceController implements OrderReturnServiceApi {
   /* public static final Integer orderReturnState =1;*/
    @Autowired
    private OrderReturnMapper orderReturnMapper;

    /**
     * 查询退货订单信息
     * @return
     */
    @Override
    @ResponseBody
    @GetMapping("queryOrderReturnlist")
    public List<OrderReturn> queryOrderReturnlist() {
        return orderReturnMapper.queryOrderReturnlist();
    }

    /**
     * 查询退货订单信息
     * @param orderId
     */
    @Override
    @ResponseBody
    public void updateState(@RequestBody Integer orderId) {
        orderReturnMapper.updateState(orderId);
    }
}
