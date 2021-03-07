package com.utour.repository;

import com.utour.entity.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends CrudRepository<Menu, Integer> {

    List<Menu> findAll();

    List<Menu> findByEnableTrueOrderByOrderNoAsc();

}
