package com.utour.service;

import com.utour.common.service.CommonService;
import com.utour.dto.AreaDto;
import com.utour.dto.MenuDto;
import com.utour.dto.CountryDto;
import com.utour.repository.AreaRepository;
import com.utour.repository.MenuRepository;
import com.utour.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class GnbService extends CommonService {

    private final MenuRepository menuRepository;
    private final AreaRepository areaRepository;
    private final CountryRepository countryRepository;

    /**
     * 메뉴조회
     * @return
     */
    public List<MenuDto> getMenu() {
        return menuRepository.findByEnableTrueOrderByOrderNoAsc()
                .stream()
                .map(entity -> MenuDto.builder()
                        .menuName(entity.getMenuName())
                        .areaCode(entity.getAreaCode())
                        .countryCode(entity.getCountryCode())
                        .build())
                .collect(Collectors.toList());
    }

    /**
     * 지역정보
     * @param countryCode
     * @return
     */
    public List<AreaDto> getArea(String countryCode) {
        return this.areaRepository.findByAreaIdCountryCodeAndEnableTrue(countryCode)
                .stream().map(entity -> AreaDto.builder()
                        .areaCode(entity.getAreaId().getAreaCode())
                        .countryCode(entity.getAreaId().getCountryCode())
                        .areaName(entity.getAreaName())
                        .build())
                .collect(Collectors.toList());
    }

    /**
     * 국가정보
     * @return
     */
    public List<CountryDto> getCounties(){
        return this.countryRepository.findByEnableTrue()
                .stream()
                .map(entity -> CountryDto.builder()
                        .countryName(entity.getCountryName())
                        .countryCode(entity.getCountryCode())
                        .build())
                .collect(Collectors.toList());
    }
}
