 package com.cl.house.api.common;

import lombok.Data;

/**
 * @author chenling
 * @date 2018/12/20
 */
 
 @Data
public  class RestResponse<T> {
	
	private int code;
	private String msg;
	private  T result;

	
	public static <T> RestResponse<T> success(){
		RestResponse<T> restResponse = new RestResponse();
		return restResponse;
	}
	
	public static <T> RestResponse<T> success(T result){
		RestResponse<T> restResponse = new RestResponse();
		restResponse.setResult(result);
		return restResponse;
	}
	
	public static <T> RestResponse<T> error(RestCode code){
		return new RestResponse(code.code,code.msg);
	}
	
	public RestResponse() {
		this(RestCode.OK.code,RestCode.OK.msg);
		
	}
	public RestResponse(int code,String msg) {
		this.code=code;
		this.msg=msg;
	}
	
	
}
