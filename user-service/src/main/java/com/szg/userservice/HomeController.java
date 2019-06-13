package com.szg.userservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * created by shizhiguo at 2019/6/11 21:18
 */
@Slf4j
@RestController
public class HomeController {
    @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${info.city}")
    String infoCity;

    @GetMapping("/infoCity")
    public String infoCity(){
        return infoCity;
    }

    @GetMapping("/user")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        log.info(services);
        return "szg";
    }
}
