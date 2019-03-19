package com.jk.service;


import com.jk.pojo.*;
import org.jboss.logging.Param;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RequestMapping("market")
public interface MarketService {

    /*
    * 查询树
    * */
    @GetMapping("querytree")
    List<TreeBean> findTree();


     /*
     * 查询销售订单
     * */
    @PostMapping("findmarketlist")
    List<Market> findmarketlists(@RequestBody Market market);


    /*
    *查询退货管理
    * */
    @PostMapping("findreturnlist")
    List<Return> findreturnlist(@RequestBody Return returns);

    /*
     * 查询常用设置
     * */
    @GetMapping("findtorelist")
    List<Store> findtorelist();

    /*新增常用设置
    * */
    @PostMapping("findaddtorelist")
    void findaddtorelist(@RequestBody Store store);

    /**
     * 发票查询
     * */
    @PostMapping("findvouchlist")
    List<Voucher> findvouchlist(@RequestBody Voucher voucher);

    /*
    * 发货查询
    * */
    @PostMapping("finddeliverlist")
    List<Market> finddeliverlist(@RequestBody Market markets);


    /*
    * 查询客服设置
    * */
    @GetMapping("findservicelist")
    List<ServiceBean> findservicelist();


    /*
    *  查询公告
    * */
    @PostMapping("findnoticelist")
    List<Notice> findnoticelist(@RequestBody Notice notice);

    /*
    * 查询快递
    * */
    @GetMapping("findexpresslist")
    List<Express> findexpresslist();

    /*
    * 删除销售订单
    * */
    @DeleteMapping("deletemarket/{ids}")
    void deletemarket(@PathVariable("ids")String ids);


    /*销售订单发货
     * */
    @PutMapping("updateInvoiceStatus/{id}")
    void updateInvoiceStatus(@PathVariable("id") Integer id);


    /*
    *销售订单回显
    * */
    @RequestMapping("findMarketOrderById")
    Market findMarketOrderById(@RequestParam("orderid") Integer orderid);

    /*
     * 退货管理修改状态
     * */
    @PutMapping("updateStatus/{id}")
    void updateStatus(@PathVariable("id") Integer id);

    /* 发票修改
     * */
    @PutMapping("updateVoucherStatus/{id}")
    void updateVoucherStatus(@PathVariable("id") Integer id);


    /*
    * 客服停用
    * */
    @PutMapping("updateservicelist/{id}")
    void updateservicelist(@PathVariable("id")Integer id);

    /*
    * 客服启动
    * */
    @PutMapping("updateservice/{id}")
    void updateservice(@PathVariable("id")Integer id);

    /*
    * 客服删除
    * */
    @DeleteMapping("deleteservice/{ids}")
    void deleteservice(@PathVariable("ids")String ids);


    /*
    * 客服回显
    * */
    @RequestMapping("findserviceById")
    ServiceBean findserviceById(@RequestParam("serviceId") Integer serviceId);

    /*
    * 客服修改
    * */
    @PostMapping("updateService")
    void updateService(@RequestBody ServiceBean serviceBean);

    /*删除配送
    * */
    @DeleteMapping("deleteExpress/{ids}")
    void deleteExpress(@PathVariable("ids") String ids);

    /*
    * 公告上线
    * */
    @PutMapping("findstatus/{id}")
    void findstatustop(@PathVariable("id") Integer id);

    /* 公告下线
    * */
    @PutMapping("findstatusdown/{id}")
    void findstatusdown(@PathVariable("id") Integer id);

    /*
    * 公告删除
    * */
    @DeleteMapping("deletenotice/{ids}")
    void deletenotice(@PathVariable("ids") String ids);

    /*
    * 退货回显
    * */
    @RequestMapping("findreturnById")
    Return findreturnById(@RequestParam("returnId") Integer returnId);

    /*客服新增
    * */
    @PostMapping("findaddservicelist")
    void findaddservicelist(@RequestBody ServiceBean serviceBean);

    /*发票回显
    * */
    @RequestMapping("findVoucherById")
    Voucher findVoucherById(@RequestParam("id") Integer id);

    /*公告新增
    * */
    @PostMapping("findaddnoticelist")
    void findaddnoticelist(@RequestBody Notice notice);

    /*公告回显
    * */
    @RequestMapping("findnoticeById")
    Notice findnoticeById(@RequestParam("id") Integer id);

    /*公告修改
    * */
    @PostMapping("updateNotice")
    void updateNotice(@RequestBody Notice notice);

    /*公告新增
    * */
    @PostMapping("findaddexpresslist")
    void findaddexpresslist(@RequestBody Express express);
}
