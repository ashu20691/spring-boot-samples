package com.intellligrape.controller

import com.intellligrape.domain.City
import com.intellligrape.domain.CityRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by intelligrape on 25/6/15.
 */
@RestController
@RequestMapping('/city')
class CityController {

    @Autowired
    CityRepository cityRepository

    @RequestMapping('/bootstrap')
    def bootstrap() {
        [cityRepository.save(new City("Gaziabad", "UP")),
         cityRepository.save(new City("New Delhi", "Delhi")),
         cityRepository.save(new City("Agra", "UP")),
         cityRepository.save(new City("Noida", "UP")),
         cityRepository.save(new City("Mumbai", "Maharashtra")),
         cityRepository.save(new City("Sirdi", "Maharashtra"))]
    }

    @RequestMapping('/show/{id}')
    City show(@PathVariable Long id) {
        id ? cityRepository.findOne(id) : null
    }

    @RequestMapping('/list')
    def list() {
        cityRepository.findAll()
    }

    @RequestMapping('/maharashtra')
    def maharashtra() {
        cityRepository.findAllByStateAllIgnoringCase("maharashtra")
    }

    @RequestMapping('/findByStateAndCity')
    def findByStateAndCity(@RequestParam String name, @RequestParam String state) {
        cityRepository.findByNameAndStateAllIgnoringCase(name, state)
    }

    @RequestMapping('/checkConstraints')
    def checkConstraints() {
        cityRepository.save(new City("Sirdi", null))
    }
}
