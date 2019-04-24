package com.cl.house.api.model;

import java.util.Date;

import lombok.Data;


@Data
public class UserMsg {
  private Long id;
  private String msg;
  private Long   userId;
  private Date   createTime;
  private Long   agentId;
  private Long   houseId;
  private String email;
  
  private String userName;
  

}
