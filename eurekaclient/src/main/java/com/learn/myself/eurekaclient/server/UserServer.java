package com.learn.myself.eurekaclient.server;

import com.learn.myself.eurekaclient.responseDTO.PersonResponseDTO;
import org.springframework.stereotype.Component;


@Component
public interface UserServer {

    PersonResponseDTO getUser();

}
