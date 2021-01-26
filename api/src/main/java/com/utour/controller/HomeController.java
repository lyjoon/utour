package com.utour.controller;

import com.utour.util.MapObject;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/home" , produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class HomeController extends BaseController {

    @Value("${spring.application.name:N/A}")
    private String applicationName;

    @GetMapping(value = "/carousel")
    public Mono<ResponseEntity> carousel(){
        return Mono.just(ResponseEntity.ok(MapObject.create("spring.application.name", applicationName)));
    }
}
