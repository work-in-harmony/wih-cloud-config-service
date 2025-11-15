package com.elu.wihcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class WihCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(WihCloudConfigApplication.class, args);
    }

}
