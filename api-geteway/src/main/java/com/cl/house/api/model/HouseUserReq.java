package com.cl.house.api.model;

import java.util.Date;

import lombok.Data;

@Data
public class HouseUserReq {

  private Long houseId;
  
  private Long userId;
  
  private Integer bindType;
  
  private boolean unBind;

  
}
