package com.szg.eurekaconsumerfeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * created by shizhiguo at 2019/6/11 21:35
 */
@FeignClient("eureka-client")
public interface EurekaClient {

    @GetMapping("/dc")
    String dc();
}
