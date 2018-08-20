package com.learn.myself.eurekaclient.controller;

import com.learn.myself.eurekaclient.responseDTO.PersonResponseDTO;
import com.learn.myself.eurekaclient.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Server {

    @Autowired
    private UserServer userServer;

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

    @GetMapping("/get")
    public PersonResponseDTO getUser(){
        return userServer.getUser();
    }
}
