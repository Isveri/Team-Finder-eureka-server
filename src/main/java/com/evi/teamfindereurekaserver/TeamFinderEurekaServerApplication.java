package com.evi.teamfindereurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TeamFinderEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamFinderEurekaServerApplication.class, args);
    }

}
