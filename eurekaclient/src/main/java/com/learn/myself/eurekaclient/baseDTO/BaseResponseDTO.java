package com.learn.myself.eurekaclient.baseDTO;

import com.learn.myself.eurekaclient.CommoDTO.Error;

import java.util.ArrayList;
import java.util.List;

public class BaseResponseDTO {

    private List<Error> errors;

    public List<Error>  addError(Error error){
        if (errors==null){
            errors =new ArrayList<Error>();
            errors.add(error);
        }else {
            errors.add(error);
        }
        return errors;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }
}
