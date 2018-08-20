package com.learn.myself.eurekaclient.server.impl;


import com.google.gson.Gson;
import com.learn.myself.eurekaclient.CommoDTO.Error;
import com.learn.myself.eurekaclient.CommoDTO.User;
import com.learn.myself.eurekaclient.responseDTO.PersonResponseDTO;
import com.learn.myself.eurekaclient.server.UserServer;
import org.springframework.stereotype.Service;

@Service
public class UserServerImp implements UserServer {
    @Override
    public PersonResponseDTO getUser() {
        PersonResponseDTO responseDTO =new PersonResponseDTO() ;
        User user =new User();
        user.setAge("18");
        user.setName("yuanqi");
        user.setLocaltion("shanghai");

        Error error = new Error();
        error.setCode("AEP_001");
        error.setSource("pvt/olss");
        error.setDetail("not found ");
        error.setMeassage("please found User name");

        Gson gson = new Gson();
        responseDTO.setUser(gson.fromJson(gson.toJson(user),User.class));
        return responseDTO;
    }
}
