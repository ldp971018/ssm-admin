package com.ldp.springbootproject.service.impl;


import com.ldp.springbootproject.bean.City;
import com.ldp.springbootproject.mapper.CityMapper;
import com.ldp.springbootproject.service.CityService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityMapper cityMapper;

    Counter counter;

    public CityServiceImpl(MeterRegistry meterRegistry){
        counter = meterRegistry.counter("cityService.saveCity.count");
    }


    public City getById(Long id){
        return cityMapper.getById(id);
    }

    public void saveCity(City city) {
        counter.increment();
        cityMapper.insert(city);

    }
}
