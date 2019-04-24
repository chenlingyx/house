package com.cl.house.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.cl.house.api.common.PageData;
import com.cl.house.api.common.PageParams;
import com.cl.house.api.dao.HouseDao;
import com.cl.house.api.model.City;
import com.cl.house.api.model.Community;
import com.cl.house.api.model.House;
import com.cl.house.api.model.ListResponse;
import com.cl.house.api.model.User;
import com.cl.house.api.model.UserMsg;
import com.cl.house.api.utils.BeanHelper;
import com.google.common.base.Joiner;

@Service
public class HouseService {
  
  
  
  @Autowired
  private FileService fileService;
  
  @Autowired
  private HouseDao houseDao;
  

  public void updateRating(Long id, Double rating) {
    houseDao.rating(id,rating);
  }

  public void addHouse(House house,User user) {
    if (house.getHouseFiles() != null && !house.getHouseFiles().isEmpty()) {
      List<MultipartFile> files = house.getHouseFiles();
      String imags = Joiner.on(",").join(fileService.getImgPaths(files));
      house.setImages(imags);
    }
    if (house.getFloorPlanFiles() != null && !house.getFloorPlanFiles().isEmpty()) {
      List<MultipartFile> files = house.getFloorPlanFiles();
      String floorPlans = Joiner.on(",").join(fileService.getImgPaths(files));
      house.setFloorPlan(floorPlans);
    }
    //FileCopyUtils
    BeanHelper.setDefaultProp(house, House.class);
    BeanHelper.onInsert(house);
    house.setUserId(user.getId());
    houseDao.addHouse(house);
  }
  

  public List<Community> getAllCommunitys() {
    return houseDao.getAllCommunitys();
  }


  public List<City> getAllCitys() {
    return houseDao.getAllCitys();
  }


  public void addUserMsg(UserMsg userMsg) {
    houseDao.addUserMsg(userMsg);
  }


  public List<House> getLastest() {
    return houseDao.getLastest();
  }

  public PageData<House> queryHouse(House query, PageParams build) {
    ListResponse<House> result = houseDao.getHouses(query,build.getLimit(),build.getOffset());
    return PageData.<House>buildPage(result.getList(), result.getCount(), build.getPageSize(), build.getPageNum());
  }

  public List<House> getHotHouse(Integer recomSize) {
    List<House> list = houseDao.getHotHouse(recomSize);
    return list;
  }

  public House queryOneHouse(long id) {
    return houseDao.getOneHouse(id);
  }

  public void bindUser2House(Long houseId, Long userId, boolean bookmark) {
    houseDao.bindUser2House(houseId,userId,bookmark);
  }

  public void unbindUser2House(Long id, Long id2, boolean b) {
    houseDao.unbindUser2House(id,id2,b);
  }




}
