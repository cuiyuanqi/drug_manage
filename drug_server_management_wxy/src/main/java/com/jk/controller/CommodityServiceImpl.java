package com.jk.controller;

import com.jk.mapper.UserMapper;
import com.jk.pojo.Commodity;
import com.jk.pojo.Password;
import com.jk.pojo.Site;
import com.jk.pojo.User;
import com.jk.service.CommodityServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CommodityServiceImpl implements CommodityServiceApi {
    @Autowired
    private UserMapper userMapper;

    @Override
    @ResponseBody
    public List<User> queryList() {
        return userMapper.queryList();
    }
    @Override
    @ResponseBody
    public List<Site> querySite() {

        return userMapper.querySite();
    }
    @Override
    @ResponseBody
    public String delCommodity(Integer id) {

        return userMapper.delCommodity(id);
    }
    @Override
    @ResponseBody
    public List<Commodity> queryCommodity() {

        return userMapper.queryCommodity();

    }
    @Override
    @ResponseBody
    public void deleteGoods(Integer id) {
        userMapper.deleteGoods(id);
    }

    @Override
    @ResponseBody
    public void saveCommodity( Commodity commodity) {
        Integer id = commodity.getId();
        if(id==null){
           userMapper.saveCommodity(commodity);
       }
        userMapper.updateCommodity(commodity);
    }

    @Override
    @ResponseBody
    public void deleteSite(Integer id) {
        userMapper.deleteSite(id);
    }

    @Override
    @ResponseBody
    public void saveSite( Site site) {
        Integer id = site.getId();
        if(id==null){
            userMapper.saveSite(site);
        }
        userMapper.updateSite(site);
    }

    @Override
    @ResponseBody
    public Site selectShopById(@RequestBody Integer id) {

        return userMapper.selectShopById(id);
    }

    @Override
    @ResponseBody
    public Commodity selectComomId(@RequestBody Integer id) {
        return userMapper.selectComomId(id);
    }

    @Override
    @ResponseBody
    public void updatesxj(@RequestParam("ids") String ids, @RequestParam("flag") Integer flag) {
        String[] id = ids.split(",");
        userMapper.updatesxj(id,flag);
    }

    @Override
    @ResponseBody
    public Password updatepassword(@RequestBody Integer id) {

        return userMapper.updatepassword(id);
    }

    @Override
    @ResponseBody
    public List<Password> querypassword() {

        return userMapper.querypassword();
    }

    @Override
    @ResponseBody
    public void updatepasswored(Password password) {
        userMapper.updatepasswored(password);
    }


}
