package com.learn.myself.serviceribbon.controller;

import com.learn.myself.serviceribbon.server.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    Server server;

    @RequestMapping("hi")
    public String home(@RequestParam String name){
        return server.hiService(name);
    }

}
