package com.cl.house.api.model;

import java.util.Date;

import lombok.Data;

@Data
public class HouseQueryReq {
  
  private House query;
  
  private Integer limit;
  
  private Integer offset;



}
