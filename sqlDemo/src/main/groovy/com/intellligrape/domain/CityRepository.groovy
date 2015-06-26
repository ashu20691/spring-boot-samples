package com.intellligrape.domain

import org.springframework.data.domain.*;
import org.springframework.data.repository.*
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;

public interface CityRepository extends CrudRepository<City, Long> {

    City findByNameAndStateAllIgnoringCase(String name, String state);

    List<City> findAllByStateAllIgnoringCase(String state);

}