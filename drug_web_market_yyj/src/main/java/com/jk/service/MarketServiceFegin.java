package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-market")
public interface MarketServiceFegin extends MarketService {



}
