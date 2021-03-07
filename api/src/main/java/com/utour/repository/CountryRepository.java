package com.utour.repository;

import com.utour.entity.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 국가정보 관련
 */
@Repository
public interface CountryRepository extends CrudRepository<Country, String> {

    List<Country> findAll();

    List<Country> findByEnableTrue();

}
