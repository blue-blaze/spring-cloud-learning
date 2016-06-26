package me.learning.cloud.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigServerMain {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigServerMain.class, args);
    }
}
