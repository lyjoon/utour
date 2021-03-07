package com.utour.repository;

import com.utour.Application;
import com.utour.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@ActiveProfiles("local")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestAreaRepository {

    @Autowired
    private AreaRepository areaRepository;

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Test
    public void testSelect() {
        List<Area> list = this.areaRepository.findByAreaIdCountryCodeAndEnableTrue("VN");
        log.info("list.size : {}", Optional.ofNullable(list).map(l -> l.size()).orElse(-1));
    }



}
