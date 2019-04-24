package com.cl.house.api.model;

import java.util.Date;

import lombok.Data;
@Data
public class Recommend {
  
  private Long id;
  private Long houseId;
  private Integer type;
  private Integer userId;
  private Integer district;
  private Date    createTime;
  

}
