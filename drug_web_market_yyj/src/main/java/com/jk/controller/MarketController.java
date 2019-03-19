package com.jk.controller;

import com.jk.pojo.*;
import com.jk.service.MarketService;
import com.jk.service.MarketServiceFegin;
import com.jk.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;


@Controller
public class MarketController {

    @Autowired
    private MarketServiceFegin  marketService;


    /*
    * 进入树的页面
    * */
    @GetMapping("totree")
    public String totree(){
        return  "tree";
    }
    /**
     * 查询树
     */
    @GetMapping("querytree")
    @ResponseBody
    public  List<TreeBean> findTree(String callback){
        List<TreeBean> tree = marketService.findTree();
//       String string =  JSON.toString(tree);
//        String str = callback + "("+string+")";
        return tree;
    }


    /*
     *进入查询的页面
     * */
    @GetMapping("tofindmarket")
    public String tofindmarketlist(){ return  "findmarketlist"; }
    /*
    * 查询销售订单
    * */
    @GetMapping("findmarketlist")
    @ResponseBody
    public List<Market> findmarketlists(Market market){
        return marketService.findmarketlists(market);
    }
    /*删除销售订单
    * */
    @DeleteMapping("deletemarket/{ids}")
    @ResponseBody
    public void deletemarket(@PathVariable("ids") String ids){
        marketService.deletemarket(ids);
    }
    /*修改销售订单发货
    * */
    @PutMapping("updateInvoiceStatus/{id}")
    @ResponseBody
    public void updateInvoiceStatus(@PathVariable("id") Integer id){
        marketService.updateInvoiceStatus(id);
    }
    /* 销售订单回显
    * */
    @GetMapping("toUpdateOrderList")
    public  String  toUpdateOrderList(){
        return  "UpdateOrderList";
    }
    /*
    * 销售订单回显
    * */
    @RequestMapping("findMarketOrderById")
    @ResponseBody
    public Market findMarketOrderById(@RequestParam("orderid") Integer orderid){
        Market marketOrderById = marketService.findMarketOrderById(orderid);
        return marketOrderById;

    }



    /*
     *进入退货查询的页面
     * */
    @GetMapping("tofindreturn")
    public String tofindreturn(){ return  "findreturnlist"; }
    /*
    * 查询退货 管理
    * */
    @GetMapping("findreturnlist")
    @ResponseBody
    public List<Return> findreturnlist(Return returns){
        return marketService.findreturnlist(returns);
    }
    /*
    * 退货管理修改状态
    * */
    @PutMapping("updateStatus/{id}")
    @ResponseBody
    public void updateStatus(@PathVariable("id") Integer id){
        marketService.updateStatus(id);
    }
    /*进入回显页面
    * */
    @RequestMapping("toupdatereturn")
    public  String  toupdatereturn(){
        return   "UpdateReturn";
    }
    /*
     * 退货回显
     * */
    @RequestMapping("findreturnById")
    @ResponseBody
    public Return findreturnById(@RequestParam("returnId") Integer returnId){
        Return marketOrderById = marketService.findreturnById(returnId);
        return marketOrderById;

    }


    /*
     *进入常用设置页面
     * */
    @GetMapping("tostorelist")
    public String tostorelist(){ return  "storelist"; }
    /*进入新增常用设置页面
     **/
    @GetMapping("toaddstorelist")
    public String toaddstorelist(){ return  "addstorelist"; }
    /*
    * 查询常用设置
    * */
    @GetMapping("findtorelist")
    @ResponseBody
    public List<Store> findtorelist(){
        return  marketService.findtorelist();
    }
    /*
     * 新增常用设置
     * */
    @PostMapping("findaddtorelist")
    @ResponseBody
    public void findaddtorelist(Store store){
          marketService.findaddtorelist(store);
    }
    /*
    * 上传图片
    * */
    /*@GetMapping("uploadUserImg")
    @ResponseBody
    public String uploadUserImg(MultipartFile img, HttpServletRequest request){
        return FileUtil.FileUpload(img, request);
    }*/


    /*
     *进入发票查询的页面
     * */
    @GetMapping("tofindvouch")
    public String tofindvouch(){ return  "vouchlist"; }
    /*
    * 发票查询
    * */
    @GetMapping("findvouchlist")
    @ResponseBody
    public List<Voucher> findvouchlist(Voucher voucher){
        return  marketService.findvouchlist(voucher);
    }
    /* 发票修改
    * */
    @PutMapping("updateVoucherStatus/{id}")
    @ResponseBody
    public void updateVoucherStatus(@PathVariable("id") Integer id){
        marketService.updateVoucherStatus(id);
    }
    /* 进入回显页面
    * */
    @GetMapping("toUpdatevouchList")
    public String toUpdatevouchList(){
        return   "UpdatevouchList";
    }
    /* 发票回显
    * */
    @RequestMapping("findVoucherById")
    @ResponseBody
    public Voucher findVoucherById(@RequestParam("id") Integer id){
        Voucher findVoucherById = marketService.findVoucherById(id);
        return findVoucherById;

    }


    /*
     *进入发货查询的页面
     * */
    @GetMapping("tofinddeliver")
    public String tofinddeliver(){ return  "finddeliver"; }
    /*
    * 发货查询
    * */
   @GetMapping("finddeliverlist")
    @ResponseBody
    public  List<Market> finddeliverlist(Market markets){
       return  marketService.finddeliverlist(markets);
   }


  /*
  * 进入客服设置页面
  * */
  @GetMapping("tofindservice")
  public  String   tofindservice(){
      return  "findservice";
  }
  /*查询客服
  * */
  @GetMapping("findservicelist")
   @ResponseBody
    public  List<ServiceBean> findservicelist(){
      return  marketService.findservicelist();
  }
   /*
   * 停用
   * */
   @PutMapping("updateservicelist/{id}")
   @ResponseBody
   public void updateservicelist(@PathVariable("id") Integer id){
       marketService.updateservicelist(id);
   }
    /*
     * 启动
     * */
    @PutMapping("updateservice/{id}")
    @ResponseBody
    public void updateservice(@PathVariable("id") Integer id){
        marketService.updateservice(id);
    }
    /*删除客服
     * */
    @DeleteMapping("deleteservice")
    @ResponseBody
    public void deleteservice(String ids){
        marketService.deleteservice(ids);
    }
    /*
    * 进入修改页面
    * */
    @GetMapping("toupdateservice")
    public  String toupdateservice(){
        return   "updateservice";
    }
    /*
     * 客服回显
     * */
    @RequestMapping("findserviceById")
    @ResponseBody
    public ServiceBean findserviceById(@RequestParam("serviceId") Integer serviceId){
        ServiceBean serviceObject =  marketService.findserviceById(serviceId);
        return serviceObject;

    }
    /*客服修改
    * */
    @GetMapping("updateService")
    @ResponseBody
    public  void updateService( ServiceBean serviceBean){
        marketService.updateService(serviceBean);
    }
   /*进入新增页面
   * */
   @GetMapping("toaddservicelist")
   public  String  toaddservicelist(){
       return   "addservicelist";
   }
   /*新增客服
   * */
    @PostMapping("findaddservicelist")
    @ResponseBody
    public void findaddservicelist(ServiceBean serviceBean){
        marketService.findaddservicelist(serviceBean);
    }








    /*
   * 进入公告页面
   * */
  @GetMapping("tofindnotice")
    public  String  tofindnotice(){
      return   "findnoticelist";
  }
  /* 查询公告
  * */
  @GetMapping("findnoticelist")
    @ResponseBody
    public List<Notice> findnoticelist(Notice notice){
      return   marketService.findnoticelist(notice);
  }
    /*公告上线
    * */
    @PutMapping("findstatus/{id}")
    @ResponseBody
    public void  findstatustop(@PathVariable("id") Integer id){
        marketService.findstatustop(id);
    }
    /*公告上线
     * */
    @PutMapping("findstatusdown/{id}")
    @ResponseBody
    public void  findstatusdown(@PathVariable("id") Integer id){
        marketService.findstatusdown(id);
    }
    /*
    *  公告删除deletenotice
    * */
    @DeleteMapping("deletenotice")
    @ResponseBody
    public void deletenotice(String ids){
        marketService.deletenotice(ids);
    }
    /*进入公告新增页面
    * */
    @GetMapping("tofindaddnotice")
    public  String  tofindaddnotice(){
        return   "addnotice";
    }
    /*公告新增
    * */
    @PostMapping("findaddnoticelist")
    @ResponseBody
    public  void  findaddnoticelist(Notice notice){
        marketService.findaddnoticelist(notice);
    }
    /*公告回显
    * */
    @RequestMapping("findnoticeById")
    @ResponseBody
    public Notice findnoticeById(@RequestParam("id") Integer id){
        Notice noticeObject =  marketService.findnoticeById(id);
        return noticeObject;
    }
    /*进入修改页面
    * */
    @GetMapping("toupdateNotice")
    public  String toupdateNotice(){
        return  "updateNotice";
    }
    /*进入修改
    * */
    @GetMapping("updateNotice")
    @ResponseBody
    public  void updateNotice( Notice notice){
        marketService.updateNotice(notice);
    }



  /*
  * 进入配送页面
  * */
  @GetMapping("tofindexpress")
    public  String tofindexpress(){
      return   "findexpresslist";
  }
  /*查询配送
  * */
  @GetMapping("findexpresslist")
    @ResponseBody
    public  List<Express> findexpresslist(){
      return   marketService.findexpresslist();
  }
      /*删除配送
      * */
      @DeleteMapping("deleteExpress")
      @ResponseBody
      public  void  deleteExpress(String ids){
         marketService.deleteExpress(ids);
      }
      /*进入新增页面
      * */
      @GetMapping("toaddexpress")
    public  String  toaddexpress(){
          return   "addExpress";
      }
      /*新增
      * */
    @PostMapping("findaddexpresslist")
    @ResponseBody
    public  void  findaddexpresslist(Express express){
        marketService.findaddexpresslist(express);
    }


}