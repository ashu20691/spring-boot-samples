package com.intellligrape

import com.intellligrape.domain.City
import com.intellligrape.domain.CityRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MySqlJpaApplication {

    @Autowired
    CityRepository cityRepository

    public static void main(String[] args) {
        SpringApplication.run(MySqlJpaApplication.class);
    }
}
