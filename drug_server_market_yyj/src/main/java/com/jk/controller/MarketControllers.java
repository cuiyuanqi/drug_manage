package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.mapper.MarketMapper;
import com.jk.pojo.*;
import com.jk.service.MarketService;
import com.jk.utils.ContantUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
public class MarketControllers implements MarketService {

    @Autowired
    private  MarketMapper   marketMapper;


    /*
     * 查询销售订单
     * */
    @Override
    @ResponseBody
    public List<Market> findmarketlists(@RequestBody Market market) {
        return marketMapper.findmarketlists(market);
    }

    /*
    * 查询退货管理
    * */
    @Override
    @ResponseBody
    public List<Return> findreturnlist(@RequestBody Return returns) {
        return marketMapper.findreturnlist(returns);
    }

    /*
     * 查询常用设置
     * */
    @Override
    @ResponseBody
    public List<Store> findtorelist() {
        List<Store> list =  marketMapper.findtorelist();
        return  list;
    }

    /*新增常用设置
    * */
    @Override
    @ResponseBody
    public void findaddtorelist(@RequestBody Store store) {
        marketMapper.findaddtorelist(store);
    }

    /*
    * 发票查询
    * */
    @Override
    @ResponseBody
    public List<Voucher> findvouchlist(@RequestBody Voucher voucher) {
        return marketMapper.findvouchlist(voucher);
    }

    /*
    * 发货查询
    * */
    @Override
    @ResponseBody
    public List<Market> finddeliverlist(@RequestBody Market markets) {
        return marketMapper.finddeliverlist(markets);
    }

    /*
     * 查询客服设置
     * */
    @Override
    @ResponseBody
    public List<ServiceBean> findservicelist() {
        return marketMapper.findservicelist();
    }


    /*
    *  查询公告
    * */
    @Override
    @ResponseBody
    public List<Notice> findnoticelist(@RequestBody Notice notice) {
        List<Notice> list = marketMapper.findnoticelist(notice);
        return list;
    }

    /*
    * 查询快递
    * */
    @Override
    @ResponseBody
    public List<Express> findexpresslist() {
        return marketMapper.findexpresslist();
    }

    /*删除销售订单
    * */
    @Override
    @ResponseBody
    public void deletemarket(String ids) {
        marketMapper.deletemarket(ids);
    }


    /*销售订单发货
     * */
    @Override
    @ResponseBody
    public void updateInvoiceStatus(Integer id) {
        marketMapper.updateInvoiceStatus(id);
    }

    /*
     * 销售订单回显
     * */
    @Override
    @ResponseBody
    public Market findMarketOrderById(@RequestParam("orderid") Integer orderid) {
        return marketMapper.findMarketOrderById(orderid);
    }

    /*
     * 退货管理修改状态
     * */
    @Override
    @ResponseBody
    public void updateStatus(Integer id) {
        marketMapper.updateStatus(id);
    }


    /* 发票修改
     * */
    @Override
    @ResponseBody
    public void updateVoucherStatus(Integer id) {
        marketMapper.updateVoucherStatus(id);
    }

    /*
    * 客服停用
    * */
    @Override
    @ResponseBody
    public void updateservicelist(Integer id) {
        marketMapper.updateservicelist(id);
    }

    /*
    * 客服启动
    * */
    @Override
    @ResponseBody
    public void updateservice(Integer id) {
        marketMapper.updateservice(id);
    }

    /*客服删除
    * */
    @Override
    @ResponseBody
    public void deleteservice(@RequestBody String ids) {
        marketMapper.deleteservice(ids);
    }

    /*
    * 客服回显
    * */
    @Override
    @ResponseBody
    public ServiceBean findserviceById(@RequestParam("serviceId") Integer serviceId) {
        return marketMapper.findserviceById(serviceId);
    }

    /*客服修改
    * */
    @Override
    @ResponseBody
    public void updateService(@RequestBody ServiceBean serviceBean) {
        marketMapper.updateService(serviceBean);
    }

    /*
    * 删除配送
    * */
    @Override
    @ResponseBody
    public void deleteExpress(@RequestBody String ids) {
        marketMapper.deleteExpress(ids);
    }

    /*
    * 公告上线
    * */
    @Override
    @ResponseBody
    public void findstatustop(Integer id) {
        marketMapper.findstatustop(id);
    }

    /*
     * 公告下线
     * */
    @Override
    @ResponseBody
    public void findstatusdown(Integer id) {
        marketMapper.findstatusdown(id);
    }

    /*
    * 公告删除
    * */
    @Override
    @ResponseBody
    public void deletenotice(@RequestBody String ids) {
        marketMapper.deletenotice(ids);
    }

    /*
    * 退货回显
    * */
    @Override
    @ResponseBody
    public Return findreturnById(@RequestParam("returnId") Integer returnId) {
        return marketMapper.findreturnById(returnId);
    }

    /*  客服新增
    * */
    @Override
    @ResponseBody
    public void findaddservicelist(@RequestBody ServiceBean serviceBean) {
        serviceBean.setServiceState(1);
        serviceBean.setServiceDate(new Date());
        marketMapper.findaddservicelist(serviceBean);
    }

    /*发票回显
    * */
    @Override
    @ResponseBody
    public Voucher findVoucherById(@RequestParam("id") Integer id) {
        return marketMapper.findVoucherById(id);
    }

    /*公告新增
    * */
    @Override
    @ResponseBody
    public void findaddnoticelist(@RequestBody Notice notice) {
        notice.setNoticeState(1);
        notice.setNoticeDate(new Date());
        marketMapper.findaddnoticelist(notice);
    }

    /*公告回显
    * */
    @Override
    @ResponseBody
    public Notice findnoticeById(@RequestParam("id") Integer id) {
        return marketMapper.findnoticeById(id);
    }

    /*公告修改
    * */
    @Override
    @ResponseBody
    public void updateNotice(@RequestBody Notice notice) {
        marketMapper.updateNotice(notice);
    }

    /* 快递新增
    * */
    @Override
    @ResponseBody
    public void findaddexpresslist(@RequestBody Express express) {
        express.setExpressTime(new Date());
        marketMapper.findaddexpresslist(express);
    }


    /*
     * 查询树
     * */
    @Override
    @ResponseBody
    public List<TreeBean> findTree() {
        int pid=0;
        List<TreeBean> list = findNodes(pid);
        return list;
    }

    private List<TreeBean> findNodes(int pid) {

        List<TreeBean> list = marketMapper.findTreeByPid(pid);
        for (TreeBean treeBean : list) {
            Integer id = treeBean.getId();
            List<TreeBean> nodes = findNodes(id);
            if(nodes.size()<=0){
                //无子节点
                treeBean.setSelectable(true);
            }else{
                //有子节点
                treeBean.setSelectable(false);
                treeBean.setNodes(nodes);
            }
        }
        return list;
    }
}
