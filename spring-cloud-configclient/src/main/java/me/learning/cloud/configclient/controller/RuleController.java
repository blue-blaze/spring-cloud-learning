package me.learning.cloud.configclient.controller;

import me.learning.cloud.configclient.component.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lcheng on 2016/6/28.
 */
@Controller
@RequestMapping("/myconf")
public class RuleController {

    @Autowired
    private Rule rule;

    @RequestMapping("/rule")
    @ResponseBody
    public Rule getRule() {
        return rule;
    }
}
