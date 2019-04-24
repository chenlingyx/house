package com.cl.house.service;

import java.util.List;

import org.apache.commons.lang3.tuple.Pair;

import com.cl.house.common.PageParams;
import com.cl.house.model.Agency;
import com.cl.house.model.User;

public interface AgencyService {

	/**
	 * @param agency
	 */
	int add(Agency agency);

	/**
	 * @return
	 */
	List<Agency> getAllAgency();

	/**
	 * @param id
	 * @return
	 */
	User getAgentDetail(Long id);

	/**
	 * @param pageParams
	 * @return
	 */
	Pair<List<User>, Long> getAllAgent(PageParams pageParams);

	/**
	 * @param id
	 * @return
	 */
	Agency getAgency(Integer id);
   
  
  
}
