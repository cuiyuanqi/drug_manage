package com.jk.pojo;

import java.util.Date;

public class Notice {

      private  Integer   noticeId;
      private  String    noticeName;    //公告标题
      private  Integer     noticeState;  //公告状态
      private   Date    noticeDate;   //公告时间
      private   Integer   storeId;       //店铺Id

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

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeName() {
        return noticeName;
    }

    public void setNoticeName(String noticeName) {
        this.noticeName = noticeName;
    }

    public Integer getNoticeState() {
        return noticeState;
    }

    public void setNoticeState(Integer noticeState) {
        this.noticeState = noticeState;
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}
