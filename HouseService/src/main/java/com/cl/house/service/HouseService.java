package com.cl.house.service;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cl.house.common.BeanHelper;
import com.cl.house.common.HouseUserType;
import com.cl.house.common.LimitOffset;
import com.cl.house.dao.UserDao;
import com.cl.house.mapper.CityMapper;
import com.cl.house.mapper.HouseMapper;
import com.cl.house.model.City;
import com.cl.house.model.Community;
import com.cl.house.model.House;
import com.cl.house.model.HouseUser;
import com.cl.house.model.User;
import com.cl.house.model.UserMsg;
import com.google.common.collect.Lists;

public interface HouseService {

	/**
	 * @param query
	 * @param build
	 * @return
	 */
	List<House> queryAndSetImg(House query, LimitOffset build);

	/**
	 * @param query
	 * @param build
	 * @return
	 */
	Pair<List<House>, Long> queryHouse(House query, LimitOffset build);

	/**
	 * @param id
	 * @return
	 */
	House queryOneHouse(long id);

	/**
	 * @param id
	 * @param rating
	 */
	void updateRating(Long id, Double rating);

	/**
	 * @param userMsg
	 */
	void addUserMsg(UserMsg userMsg);

	/**
	 * @return
	 */
	List<Community> getAllCommunitys();

	/**
	 * @return
	 */
	List<City> getAllCitys();

	/**
	 * @param house
	 * @param userId
	 */
	void addHouse(House house, Long userId);

	/**
	 * @param houseId
	 * @param userId
	 * @param houseUserType
	 */
	void unbindUser2Houser(Long houseId, Long userId, HouseUserType houseUserType);

	/**
	 * @param houseId
	 * @param userId
	 * @param houseUserType
	 */
	void bindUser2House(Long houseId, Long userId, HouseUserType houseUserType);
	
	
}
