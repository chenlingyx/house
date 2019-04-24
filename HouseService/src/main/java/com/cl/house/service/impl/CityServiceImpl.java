package com.cl.house.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl.house.mapper.CityMapper;
import com.cl.house.model.City;
import com.cl.house.service.CityService;

@Service
public class CityServiceImpl implements CityService {
  
  @Resource
  private CityMapper cityMapper;
  
  public List<City> getAllCitys(){
    City query = new City();
    return cityMapper.selectCitys(query);
  }

}
