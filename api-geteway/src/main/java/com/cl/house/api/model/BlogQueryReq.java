package com.cl.house.api.model;

import java.util.Date;

import lombok.Data;

@Data
public class BlogQueryReq {
  
  private Blog blog;
  
  private Integer limit;
  
  private Integer offset;

  

}
