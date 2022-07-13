package com.ldp.springbootproject.service;

import com.ldp.springbootproject.bean.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface CityService {

     City getById(Long id);

     void saveCity(City city);

}
