package com.cl.house.exception;

import com.cl.house.common.RestCode;
import com.google.common.collect.ImmutableMap;

public class Exception2CodeMap {
  
  private static final ImmutableMap<Object, RestCode> MAP = ImmutableMap.<Object, RestCode>builder()
      .put(IllegalParamsException.Type.WRONG_PAGE_NUM, RestCode.WRONG_PAGE)
      .build();

  public static ImmutableMap<Object, RestCode>  getMap(){
    return MAP;
  }
  
  
  public static RestCode getCode(Object exOrType){
    RestCode code = MAP.get(exOrType);
    if (code == null) {
      return RestCode.UNKNOWN_ERROR;
    }
    return code;
  }
}
