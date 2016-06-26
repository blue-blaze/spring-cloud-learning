package me.learning.cloud.configclient;

import me.learning.cloud.configclient.component.Rule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringConfigClientMain {

    private static final Logger log = LoggerFactory.getLogger(SpringConfigClientMain.class);

    @Autowired
    private Rule rule;

    @Bean
    public CommandLineRunner init(){
        return args ->{
            log.info("config rule from remote,name: {}, desc: {}",rule.getName(),rule.getDesc());
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigClientMain.class, args);
    }
}
