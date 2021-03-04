package com.utour.controller;

import com.utour.common.controller.CommonController;
import com.utour.dto.AreaDto;
import com.utour.dto.MenuDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/global", produces = MediaType.APPLICATION_JSON_VALUE)
public class GlobalController extends CommonController {

    /**
     * 메뉴 조회
     * @return
     */
    @GetMapping(value = "/menu")
    public Mono<List<MenuDto>> getMenu(){
        return Mono.empty();
    }

    /**
     * 지역 조회
     * @param nationCode
     * @return
     */
    @GetMapping(value = "/area/{nation_code}")
    public Mono<List<AreaDto>> getAreaList(@PathVariable(value = "nation_code") String nationCode){
        this.log.info("nation-code : {}", nationCode);
        return Mono.empty();
    }
}
