package com.jk.pojo;

import java.util.Date;

public class Return {

    private  Integer  returnId;
    private  String   orderCode;    //订单号
    private  String   returnCode;   //退货单号
    private  String   returnName;    //退货商品名称
    private   Date    returnDate;    //退货时间
    private  String   purchaseName;   //采购商
    private  String   proposerName;   //申请人
    private  Integer   price;           //价格
    private  Integer   returnState;     //状态


    private  String  stateDate;
    private  String   endDate;

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

    public Integer getReturnId() {
        return returnId;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    public String getProposerName() {
        return proposerName;
    }

    public void setProposerName(String proposerName) {
        this.proposerName = proposerName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getReturnState() {
        return returnState;
    }

    public void setReturnState(Integer returnState) {
        this.returnState = returnState;
    }
}
