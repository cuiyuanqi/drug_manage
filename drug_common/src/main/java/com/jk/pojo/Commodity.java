package com.jk.pojo;

public class Commodity {
    private Integer id;
    private String commoName;
    private String commoId ;
    private String commoSpecifications ;
    private String manuFacturer ;
    private String approvalNumber ;
    private String commoPrice ;
    private String commoLnventory ;
    private String commoState ;
    private String commoDate ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommoName() {
        return commoName;
    }

    public void setCommoName(String commoName) {
        this.commoName = commoName;
    }

    public String getCommoId() {
        return commoId;
    }

    public void setCommoId(String commoId) {
        this.commoId = commoId;
    }

    public String getCommoSpecifications() {
        return commoSpecifications;
    }

    public void setCommoSpecifications(String commoSpecifications) {
        this.commoSpecifications = commoSpecifications;
    }

    public String getManuFacturer() {
        return manuFacturer;
    }

    public void setManuFacturer(String manuFacturer) {
        this.manuFacturer = manuFacturer;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public String getCommoPrice() {
        return commoPrice;
    }

    public void setCommoPrice(String commoPrice) {
        this.commoPrice = commoPrice;
    }

    public String getCommoLnventory() {
        return commoLnventory;
    }

    public void setCommoLnventory(String commoLnventory) {
        this.commoLnventory = commoLnventory;
    }

    public String getCommoState() {
        return commoState;
    }

    public void setCommoState(String commoState) {
        this.commoState = commoState;
    }

    public String getCommoDate() {
        return commoDate;
    }

    public void setCommoDate(String commoDate) {
        this.commoDate = commoDate;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", commoName='" + commoName + '\'' +
                ", commoId='" + commoId + '\'' +
                ", commoSpecifications='" + commoSpecifications + '\'' +
                ", manuFacturer='" + manuFacturer + '\'' +
                ", approvalNumber='" + approvalNumber + '\'' +
                ", commoPrice='" + commoPrice + '\'' +
                ", commoLnventory='" + commoLnventory + '\'' +
                ", commoState='" + commoState + '\'' +
                ", commoDate='" + commoDate + '\'' +
                '}';
    }
}
