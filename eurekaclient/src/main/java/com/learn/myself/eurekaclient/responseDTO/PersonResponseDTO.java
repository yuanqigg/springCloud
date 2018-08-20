package com.learn.myself.eurekaclient.responseDTO;

import com.learn.myself.eurekaclient.CommoDTO.User;
import com.learn.myself.eurekaclient.baseDTO.BaseResponseDTO;

public class PersonResponseDTO extends BaseResponseDTO {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
