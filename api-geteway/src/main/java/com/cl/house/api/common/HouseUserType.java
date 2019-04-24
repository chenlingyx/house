 package com.cl.house.api.common;

 /**
 * @author chenling
 * @date 2018/12/20
 */
public enum HouseUserType {
	
	 SALE(1),BOOKMARK(2);
	  
	  public  final Integer value;
	  
	  private HouseUserType(Integer value){
	    this.value = value;
	  }
	
}
