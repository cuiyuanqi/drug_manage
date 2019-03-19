package com.jk.pojo;

import java.util.Date;

public class Voucher {

    private  Integer   id;
    private  String    vouchertype;   //发票类型
    private   Date    voucherDate;   //发票时间
    private   Integer  voucherStatus;   //发票装台
    private   String  voucherdeptil;    //发票内容
    private   String  voucherMany;      //发票金额
    private   String    voucherName;    //采购人姓名
    private   String    voucherfirm;    //采购企业
    private   Integer   orderid;
    private   Integer  orderCode;       //订单号


    private  String    stateDate;
    private  String    endDate;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVouchertype() {
        return vouchertype;
    }

    public void setVouchertype(String vouchertype) {
        this.vouchertype = vouchertype;
    }

    public Date getVoucherDate() {
        return voucherDate;
    }

    public void setVoucherDate(Date voucherDate) {
        this.voucherDate = voucherDate;
    }

    public Integer getVoucherStatus() {
        return voucherStatus;
    }

    public void setVoucherStatus(Integer voucherStatus) {
        this.voucherStatus = voucherStatus;
    }

    public String getVoucherdeptil() {
        return voucherdeptil;
    }

    public void setVoucherdeptil(String voucherdeptil) {
        this.voucherdeptil = voucherdeptil;
    }

    public String getVoucherMany() {
        return voucherMany;
    }

    public void setVoucherMany(String voucherMany) {
        this.voucherMany = voucherMany;
    }

    public String getVoucherName() {
        return voucherName;
    }

    public void setVoucherName(String voucherName) {
        this.voucherName = voucherName;
    }

    public String getVoucherfirm() {
        return voucherfirm;
    }

    public void setVoucherfirm(String voucherfirm) {
        this.voucherfirm = voucherfirm;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(Integer orderCode) {
        this.orderCode = orderCode;
    }
}
