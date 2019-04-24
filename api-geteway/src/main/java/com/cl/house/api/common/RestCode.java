 package com.cl.house.api.common;

 /**
 * @author chenling
 * @date 2018/12/20
 */
public enum RestCode {

		OK(0,"OK"),
	    UNKOWN_ERROR(1,"服务器异常"),
	    WRONG_PAGE(10100,"页面不存在");
	    
	    public final int code;
	    public final String msg;
	    
	    RestCode(int code,String msg){
	    	this.code=code;
	    	this.msg=msg;
	    	
	    }
}
