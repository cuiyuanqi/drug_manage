package com.jk.controller;
import com.jk.pojo.Commodity;
import com.jk.pojo.Password;
import com.jk.pojo.Site;
import com.jk.pojo.User;
import com.jk.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class CommodityController {

    @Autowired
    private CommodityService commodityService;


    @GetMapping("queryList")
    @ResponseBody
    public List<User> queryList(){
        return  commodityService.queryList();
    }
    @GetMapping("querySite")
    @ResponseBody
    public List<Site> querySite(){
        return  commodityService.querySite();
    }
    @GetMapping("queryCommodity")
    @ResponseBody
    public List<Commodity> queryCommodity(){
        return  commodityService.queryCommodity();
    }

    @RequestMapping("/select")
    public  String select(){
        return "sitelist";
    }

    @PostMapping("saveCommodity")
    @ResponseBody
    public void saveCommodity( Commodity commodity){
        commodityService.saveCommodity(commodity);

    }
    @DeleteMapping("delCommodity")
    @ResponseBody
    public String delCommodity(Integer Id){
        return commodityService.delCommodity(Id);
    }
    @GetMapping("/queryCommoditylist")
    public String queryCommoditylist(){
        return "Commoditylist";
    }
    @GetMapping("/toAddComm")
    public String toAddComm(){
        return "toAddComm";

    }
    @DeleteMapping("deleteGoods/{id}")
    @ResponseBody
    public void deleteGoods(@PathVariable("id") Integer id){
        commodityService.deleteGoods(id);
    }
    @DeleteMapping("deleteSite/{id}")
    @ResponseBody
    public void deleteSite(@PathVariable("id") Integer id){
        commodityService.deleteSite(id);
    }

@PostMapping("saveSite")
@ResponseBody
public void saveSite( Site site){

        commodityService.saveSite(site);
}
    @GetMapping("/toAddSite")
    public String toAddSite(){
        return "toAddSite";
    }
    @GetMapping("/toAttract")
    public String toAttract(){
        return "toAttract";

    }
    @GetMapping("selectShopById")
    @ResponseBody
    public Site selectShopById(Integer id){
        Site site = commodityService.selectShopById(id);
        return site;

    }
    @GetMapping("selectComomId")
    @ResponseBody
    public Commodity selectComomId(Integer id){
        Commodity commodity = commodityService.selectComomId(id);
        return commodity;

    }
    @GetMapping("updatesxj")
    @ResponseBody
    public void updatesxj(String ids,Integer flag){

        commodityService.updatesxj(ids,flag);
    }
    @GetMapping("updatepassword")
    @ResponseBody
    public Password updatepassword(Integer id){
        Password password=commodityService.updatepassword(id);
        return password;
    }
    @RequestMapping("/password")
    public  String password(){
        return "Password";
    }
    @RequestMapping("/topassword")
    public  String topassword(){
        return "topassword";
    }
    @RequestMapping("querypassword")
    @ResponseBody
    public  List<Password> querypassword(){
        return commodityService.querypassword();
    }

    @PostMapping("updatepasswored")
    @ResponseBody
    public void updatepasswored( Password password){

        commodityService.updatepasswored(password);
    }
}

