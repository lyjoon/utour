package com.utour.controller;

import com.utour.util.MapObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
public class TestController extends BaseController {

	@Value("${spring.application.name:N/A}")
	private String applicationName;

	/**
	 * test-api
	 * @return
	 */
	@GetMapping(value = "/info")
	public Object info(){
		return MapObject.create("spring.application.name", applicationName);
	}

	/**
	 * test-api mono
	 * @return
	 */
	@GetMapping(value = "/mono/info")
	public Mono<Object> monoInfo(){
		return Mono.just(this.info());
	}

}
