package com.jk.service;

import com.jk.pojo.Commodity;
import com.jk.pojo.Password;
import com.jk.pojo.Site;
import com.jk.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CommodityServiceApi {

    @GetMapping("queryList")
    List<User> queryList();
    @GetMapping("querySite")
    List<Site> querySite();


    @GetMapping("delCommodity")
    String delCommodity(Integer id);
    @GetMapping("queryCommodity")
    List<Commodity> queryCommodity();

    @DeleteMapping("deleteGoods/{id}")
    @ResponseBody
    void deleteGoods(@PathVariable("id") Integer id);

    @PostMapping("saveCommodity")
    @ResponseBody
    void saveCommodity(@RequestBody Commodity commodity);

    @DeleteMapping("deleteSite/{id}")
    @ResponseBody
    void deleteSite(Integer id);

    @PostMapping("saveSite")
    @ResponseBody
    void saveSite(@RequestBody Site site);

    @PostMapping("selectShopById")
    Site selectShopById(@RequestBody Integer id);
    @PostMapping("selectComomId")
    Commodity selectComomId(@RequestBody Integer id);

    @PostMapping("updatesxj")
    void updatesxj(@RequestParam("ids") String ids,@RequestParam("flag") Integer flag);

    @PostMapping("updatepassword")
    Password updatepassword( @RequestBody Integer id);
    @GetMapping("querypassword")
    List<Password> querypassword();
    @PostMapping("updatepasswored")
    @ResponseBody
    void updatepasswored(@RequestBody Password password);
}
