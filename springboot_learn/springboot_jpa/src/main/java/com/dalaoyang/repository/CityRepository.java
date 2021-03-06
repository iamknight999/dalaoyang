package com.dalaoyang.repository;

import com.dalaoyang.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author dalaoyang
 * @Description
 * @project springboot_learn
 * @package com.dalaoyang.Repository
 * @email 397600342@qq.com
 * @date 2018/4/7
 */
public interface CityRepository extends JpaRepository<City,Integer> {
}
