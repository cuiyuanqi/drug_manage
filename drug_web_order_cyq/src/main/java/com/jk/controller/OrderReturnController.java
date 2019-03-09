package com.jk.controller;

import com.jk.pojo.OrderReturn;
import com.jk.service.OrderReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderReturnController {

    @Autowired
    private OrderReturnService orderReturnService;

    /**
     * 查询页面跳转
     * @return
     */
    @GetMapping("toOrderReturn")
    public String toOrderReturn(){
        return "OrderReturn";
    }


    /**
     * 查询退货订单信息
     * @return
     */
    @GetMapping("queryOrderReturnlist")
    @ResponseBody
    public List<OrderReturn> queryOrderReturnlist(){
        return orderReturnService.queryOrderReturnlist();
    }

    /**
     * 确认订单信息
     * @param orderId
     */
    @PostMapping("updateState")
    @ResponseBody
    public void updateState(Integer orderId){
        orderReturnService.updateState(orderId);
    }



}
