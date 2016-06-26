package me.learning.cloud.configserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lcheng on 2016/6/25.
 */
@RestController("/conf")
public class ConfigController {

    @RequestMapping("/get")
    public String getConfig(){
        return "conf-server:";
    }
}
