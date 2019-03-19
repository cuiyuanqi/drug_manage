package com.jk.pojo;

import java.util.Date;

public class Express {

    private  Integer  expressId;
    private  String    expressName;      //快递名字
    private  Integer   areaId;
    private  String    Infoexemption;    //是否包邮
    private Date expressTime;
    private  Integer   expressPrice;     //运费


    public Date getExpressTime() {
        return expressTime;
    }

    public void setExpressTime(Date expressTime) {
        this.expressTime = expressTime;
    }

    public Integer getExpressId() {
        return expressId;
    }

    public void setExpressId(Integer expressId) {
        this.expressId = expressId;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getInfoexemption() {
        return Infoexemption;
    }

    public void setInfoexemption(String infoexemption) {
        Infoexemption = infoexemption;
    }

    public Integer getExpressPrice() {
        return expressPrice;
    }

    public void setExpressPrice(Integer expressPrice) {
        this.expressPrice = expressPrice;
    }
}
