package com.cl.house.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cl.house.model.City;

@Mapper
public interface CityMapper {
  
  public List<City> selectCitys(City city);

}
