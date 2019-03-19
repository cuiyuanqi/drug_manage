package com.jk.mapper;

import com.jk.pojo.*;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

public interface MarketMapper {


    /*
     * 查询树
     * */
    @Select("select * from z_tree where pid = #{pid}")
    List<TreeBean> findTreeByPid(int pid);


    /*
    * 查询销售订单
    * */
   List<Market> findmarketlists(@Param("market") Market market);

   /*
   * 查询退货管理
   * */
 /*  @Select("select r.returnId,r.orderCode,r.returnCode,r.returnName,r.returnDate,r.purchaseName," +
           "r.proposerName,r.price,r.returnState from z_return r")*/
    List<Return> findreturnlist(@Param("returns") Return returns);


   /*
   * 查询常用设置
   * */
   @Select("select s.storeId,s.storeName,s.phoneName,s.storePhone from z_store s")
    List<Store> findtorelist();

   /*新增常用设置
   * */
   @Insert("insert into z_store(storeName,storePhone,phoneName) values" +
           "(#{storeName},#{storePhone},#{phoneName})")
    void findaddtorelist(Store store);

   /*
   * 发票查询
   * */
/*   @Select("select  v.id,v.vouchertype,o.orderCode,v.voucherDate,v.voucherfirm,v.voucherName," +
           "v.voucherStatus,v.voucherdeptil,v.voucherMany  from z_voucher v left join z_order o on v.orderid = o.orderid")*/
    List<Voucher> findvouchlist(@Param("voucher") Voucher voucher);


   /*
   * 发货查询
   * */
  /* @Select(" select o.orderName,o.orderDrugSpecification,o.orderNumber," +
           "o.orderPrice,o.orderAggregate from  z_order o")*/
    List<Market> finddeliverlist(@Param("markets") Market markets);


    /*
     * 查询客服设置
     * */
    @Select("select  s.serviceId,s.serviceName,s.serviceQQ,s.serviceState,s.serviceDate  from  z_service  s")
    List<ServiceBean> findservicelist();


    /*
    * 查询公告
    * */
   /*@Select("select n.noticeId,n.noticeName,n.noticeState,n.noticeDate from z_notice n " +
            "LEFT JOIN z_notice s on n.storeId = s.storeId")*/
    List<Notice> findnoticelist(@Param("notice") Notice  notice);

    /*
    * 查询快递
    * */
    @Select("select x.expressId,x.expressName,x.expressTime from z_express x")
    List<Express> findexpresslist();


    /*
    * 删除销售订单
    * */
    @Delete("delete from z_order where orderid = #{ids}")
    void deletemarket(String ids);


    /*
    * 销售订单发货
    * */
    @Update("update z_order o set o.orderState=3 where o.orderid=#{id}")
    void updateInvoiceStatus(Integer id);


    /*
     * 销售订单回显
     * */
    @Select("select t.orderid,t.orderCode,t.orderName,t.orderDrugSpecification,t.orderNumber, " +
            "t.orderGathering,t.orderState from z_order t where t.orderid = #{value}")
    Market findMarketOrderById(Integer orderid);


 /*
  * 退货管理修改状态
  * */
 @Update("update  z_return  r set r.returnState=2  where  r.returnId = #{id}")
    void updateStatus(Integer id);

     /* 发票修改
     * */
     @Update(" update  z_voucher  v  set  v.voucherStatus= 1 where v.id = #{id}")
     void updateVoucherStatus(Integer id);

     /*客服停用
     * */
     @Update("update z_service s set s.serviceState = 2 where s.serviceId = #{id}")
      void updateservicelist(Integer id);

     /*
     * 客服启动
     * */
     @Update("update z_service s set s.serviceState = 1 where s.serviceId = #{id}")
      void updateservice(Integer id);

     /*客服删除
     * */
     @Delete("delete from z_service where serviceId = #{ids}")
     void deleteservice(String ids);

     /*
     * 客服回显
     * */
     /*@Select(" select  s.serviceId,s.serviceName,s.serviceQQ" +
             "   from  z_service  s  where  s.serviceId = #{value}")*/
    ServiceBean findserviceById(Integer serviceId);


     /* 客服修改
     * */
     @Update("update z_service  set  serviceName=#{serviceName},serviceQQ=#{serviceQQ} where serviceId=#{serviceId}")
 void updateService(ServiceBean serviceBean);

     /*删除配送
     * */
     @Delete("delete from z_express where expressId = #{ids}")
    void deleteExpress(String ids);

     /*
     * 公告修改上线
     * */
     @Update("update z_notice set noticeState = 2  where noticeId = #{id}")
     void findstatustop(Integer id);

     /*
     * 公告下线
     * */
     @Update("update z_notice set noticeState = 1  where noticeId = #{id}")
     void findstatusdown(Integer id);

     /*
     * 公告删除
     * */
     @Delete("delete from  z_notice  where  noticeId = #{ids}")
    void deletenotice(String ids);

     /*退货回显
     * */
     @Select("select r.returnId,r.orderCode,r.returnCode,r.returnName,r.returnDate,r.purchaseName," +
             " r.proposerName,r.price from z_return r where r.returnId = #{returnId}")
    Return findreturnById(Integer returnId);

     /*客服新增
     * */
  /*  @Insert("insert into z_service(serviceName,serviceQQ,serviceState,serviceDate) values" +
            " (#(serviceName),#{serviceQQ},serviceState = 1,serviceDate = sysdate)")*/
    void findaddservicelist(ServiceBean serviceBean);

    /*发票回显
    * */
    @Select("select  v.id,v.vouchertype,v.voucherDate,v.voucherfirm,v.voucherName,v.voucherStatus,v.voucherdeptil,v.voucherMany  from z_voucher v where v.id = #{id}")
    Voucher findVoucherById(Integer id);

    /*公告新增
    * */
    void findaddnoticelist(Notice notice);

    /*公告回显啊
    * */
    @Select("select n.noticeId,n.noticeName,n.noticeState,n.noticeDate from z_notice n where n.noticeId = #{id}")
    Notice findnoticeById(Integer id);

    /*公告修改
    * */
    @Update("update z_notice set noticeName = #{noticeName} where noticeId = #{noticeId}")
    void updateNotice(Notice notice);

    /* 快递新增
    * */
    void findaddexpresslist(Express express);
}
