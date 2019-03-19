package com.jk.pojo;

import java.util.Date;

public class ServiceBean {

    private  Integer   serviceId;
    private  String   serviceName;    //客服名称
    private  String    serviceQQ;     //QQ
    private  Integer   serviceState;   //客服状态
    private  Date   serviceDate;    //创建时间


    public Integer getServiceId(){
        return serviceId;
    }

    public void setServiceId(Integer serviceId){
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceQQ() {
        return serviceQQ;
    }

    public void setServiceQQ(String serviceQQ) {
        this.serviceQQ = serviceQQ;
    }

    public Integer getServiceState() {
        return serviceState;
    }

    public void setServiceState(Integer serviceState) {
        this.serviceState = serviceState;
    }


    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }
}
