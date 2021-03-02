package com.utour.common.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;

@Slf4j
public class CommonService {

    @Autowired
    protected MessageSourceAccessor messageSourceAccessor;

    protected String getMessage(String code){
        return this.messageSourceAccessor.getMessage(code);
    }

    protected String getMessage(String code, Object[] args){
        return this.messageSourceAccessor.getMessage(code, args);
    }

    protected String getMessage(String code, Object[] args, String defaultMessage){
        return this.messageSourceAccessor.getMessage(code, args, defaultMessage);
    }
}
