 package com.cl.house.api.common;

import java.util.Collections;
import java.util.List;

import lombok.Data;

/**
 * @author chenling
 * @date 2018/12/20
 */

@Data
public class PageData<T> {
	
	    private List<T> list;

	    private Pagination pagination;

	    public PageData(Pagination pagination,List<T> list) {
	        this.pagination = pagination;
	        this.list = list;
	    }
		
		public static <T> PageData<T> buildPage(List<T> list,Long count,Integer pageSize,Integer pageNum){
			Pagination _pagination = new Pagination(pageSize, pageNum,count,list.size());
			return new PageData<T>(_pagination, list);
		}

		public static <T> PageData<T> emptyPage(Integer pageSize,Integer pageNum){
			Pagination _pagination = new Pagination(pageSize, pageNum,0L,0);
			return new PageData<T>(_pagination, Collections.EMPTY_LIST);
		}
	
	
}
