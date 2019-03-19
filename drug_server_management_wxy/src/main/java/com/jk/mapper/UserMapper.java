package com.jk.mapper;

import com.jk.pojo.Commodity;
import com.jk.pojo.Password;
import com.jk.pojo.Site;
import com.jk.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface UserMapper {

    List<User> queryList();

    List<Commodity> queryComm();

    List<Site> querySite();
    
    String delCommodity(Integer id);

    List<Commodity> queryCommodity();

    void deleteGoods(Integer id);

    void saveCommodity(Commodity commodity);

    void deleteSite(Integer id);

    void saveSite(Site site);


    Site selectShopById(Integer id);

    void updateSite(Site site);

    Commodity selectComomId(Integer id);

    void updateCommodity(Commodity commodity);


    void updatesxj(@Param("array") String[] array, @Param("flag") Integer flag);

    Password updatepassword(Integer id);

    List<Password> querypassword();

    void updatepasswored(Password password);
}
