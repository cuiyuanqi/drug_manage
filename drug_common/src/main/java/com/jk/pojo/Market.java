package com.jk.pojo;

import java.util.Date;

public class Market {

    private  Integer    orderid;
    private  String     orderName;           //药品名称
    private  Integer    orderCode;            //订单号
    private  String     orderDrugSpecification;   //规格
    private  Integer    orderPrice;           //价格
    private  String     orderFreight;      //运费
    private  String     orderNumber;      // 数量
    private  String     orderAggregate;     //总金额
    private  Integer    orderaActivity;      // 活动产品
    private  Integer    orderGeneralize;      //推广产品
    private  Integer    orderGathering;       // 总收款
    private  Integer    orderState;           //状态
    private  Date       orderTime;            //下单时间
    private  Integer    shippingAddressId;   //地址id

    private  String    stateDate;
    private  String    endDate;

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getStateDate() {
        return stateDate;
    }

    public void setStateDate(String stateDate) {
        this.stateDate = stateDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Integer getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(Integer orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderDrugSpecification() {
        return orderDrugSpecification;
    }

    public void setOrderDrugSpecification(String orderDrugSpecification) {
        this.orderDrugSpecification = orderDrugSpecification;
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderFreight() {
        return orderFreight;
    }

    public void setOrderFreight(String orderFreight) {
        this.orderFreight = orderFreight;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderAggregate() {
        return orderAggregate;
    }

    public void setOrderAggregate(String orderAggregate) {
        this.orderAggregate = orderAggregate;
    }

    public Integer getOrderaActivity() {
        return orderaActivity;
    }

    public void setOrderaActivity(Integer orderaActivity) {
        this.orderaActivity = orderaActivity;
    }

    public Integer getOrderGeneralize() {
        return orderGeneralize;
    }

    public void setOrderGeneralize(Integer orderGeneralize) {
        this.orderGeneralize = orderGeneralize;
    }

    public Integer getOrderGathering() {
        return orderGathering;
    }

    public void setOrderGathering(Integer orderGathering) {
        this.orderGathering = orderGathering;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Integer getShippingAddressId() {
        return shippingAddressId;
    }

    public void setShippingAddressId(Integer shippingAddressId) {
        this.shippingAddressId = shippingAddressId;
    }
}
