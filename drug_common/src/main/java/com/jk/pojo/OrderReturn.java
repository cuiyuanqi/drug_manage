package com.jk.pojo;

import java.util.Date;

/**
 * 退货单查询
 */
public class OrderReturn {
    /**
     *  退货商品id
     */
    private Integer orderReturnId;
    /**
     *  退货名字
     */
    private String orderReturnName;
    /**
     *  退货图片
     */
    private String orderReturnImg;
    /**
     *  退货时间
     */
    private Date orderReturnDate;
    /**
     *  退货数量
     */
    private Integer orderReturnNumber;
    /**
     *  供应商
     */
     private String supplier;
    /**
     *  退货金额
     */
    private Double orderReturnMoney;
    /**
     *  退货状态(已确认 == 1,未确认 == 2)
     */
    private Integer orderReturnState;

    public Integer getOrderReturnId() {
        return orderReturnId;
    }

    public void setOrderReturnId(Integer orderReturnId) {
        this.orderReturnId = orderReturnId;
    }

    public String getOrderReturnName() {
        return orderReturnName;
    }

    public void setOrderReturnName(String orderReturnName) {
        this.orderReturnName = orderReturnName;
    }

    public String getOrderReturnImg() {
        return orderReturnImg;
    }

    public void setOrderReturnImg(String orderReturnImg) {
        this.orderReturnImg = orderReturnImg;
    }

    public Date getOrderReturnDate() {
        return orderReturnDate;
    }

    public void setOrderReturnDate(Date orderReturnDate) {
        this.orderReturnDate = orderReturnDate;
    }

    public Integer getOrderReturnNumber() {
        return orderReturnNumber;
    }

    public void setOrderReturnNumber(Integer orderReturnNumber) {
        this.orderReturnNumber = orderReturnNumber;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Double getOrderReturnMoney() {
        return orderReturnMoney;
    }

    public void setOrderReturnMoney(Double orderReturnMoney) {
        this.orderReturnMoney = orderReturnMoney;
    }

    public Integer getOrderReturnState() {
        return orderReturnState;
    }

    public void setOrderReturnState(Integer orderReturnState) {
        this.orderReturnState = orderReturnState;
    }

    @Override
    public String toString() {
        return "OrderReturn{" +
                "orderReturnId=" + orderReturnId +
                ", orderReturnName='" + orderReturnName + '\'' +
                ", orderReturnImg='" + orderReturnImg + '\'' +
                ", orderReturnDate=" + orderReturnDate +
                ", orderReturnNumber=" + orderReturnNumber +
                ", supplier='" + supplier + '\'' +
                ", orderReturnMoney=" + orderReturnMoney +
                ", orderReturnState=" + orderReturnState +
                '}';
    }
}
