package com.utour.repository;

import com.utour.entity.Area;
import com.utour.entity.index.AreaId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 국가하위 지역(도시)정보
 */
@Repository
public interface AreaRepository extends CrudRepository<Area, AreaId> {

}
