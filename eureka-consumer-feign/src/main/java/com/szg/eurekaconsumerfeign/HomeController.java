package com.szg.eurekaconsumerfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by shizhiguo at 2019/6/11 21:37
 */
@RestController
public class HomeController {

    @Autowired
    EurekaClient eurekaClient;

    @GetMapping("/consumer")
    public String dc() {
        return eurekaClient.dc();
    }
}
