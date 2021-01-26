package com.utour.controller;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

public class BaseController {

	protected HttpSession getSession(boolean create){
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession(create);
	}

	protected HttpSession getSession(){
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession(false);
	}
}
