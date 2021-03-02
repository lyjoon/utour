package com.utour.repository;

import com.utour.entity.Nation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 국가정보 관련
 */
@Repository
public interface NationRepository extends CrudRepository<Nation, String> {

    List<Nation> findAll();
}
