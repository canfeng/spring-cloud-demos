package com.szg.streamhello;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StreamProducerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(StreamProducerApplication.class).web(true).run(args);
    }
}

