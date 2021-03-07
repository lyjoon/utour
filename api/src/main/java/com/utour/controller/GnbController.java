package com.utour.controller;

import com.utour.common.controller.CommonController;
import com.utour.dto.AreaDto;
import com.utour.dto.MenuDto;
import com.utour.dto.CountryDto;
import com.utour.service.GnbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * 전역 데이터 정보
 */
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/gnb", produces = MediaType.APPLICATION_JSON_VALUE)
public class GnbController extends CommonController {

    private final GnbService gnbService;

    /**
     * 메뉴 조회
     * @return
     */
    @GetMapping(value = "/menu")
    public List<MenuDto> getMenu(){
        return this.gnbService.getMenu();
    }

    /**
     * 지역 조회
     * @param countryCode
     * @return
     */
    @GetMapping(value = "/area/{country_code}")
    public Mono<List<AreaDto>> getArea(@PathVariable(value = "country_code") String countryCode){
        return Mono.just(countryCode)
                .map(code -> this.gnbService.getArea(countryCode));
    }

    /**
     * 국가코드 조회
     * @return
     */
    @GetMapping(value = "/counties")
    public List<CountryDto> getCounties(){
        return this.gnbService.getCounties();
    }
}
