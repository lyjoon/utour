package com.utour.repository;

import com.utour.Application;
import com.utour.entity.Menu;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@ActiveProfiles("local")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestMenuRepository {

    @Autowired
    private MenuRepository menuRepository;

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Test
    public void testAll(){
        List<Menu> menuList = this.menuRepository.findAll();

        log.info("menu-size : {}", menuList.size());
        Assert.assertNotNull(menuList);
    }

}
