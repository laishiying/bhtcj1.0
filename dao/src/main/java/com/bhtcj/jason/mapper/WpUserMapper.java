package com.bhtcj.jason.mapper;

import com.bhtcj.jason.entity.WpUser;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface WpUserMapper {

	void insertWpUser(WpUser wpUser);

	void deleteWpUserByUserId(Integer userId);

	void updateWpUser(WpUser wpUser);

	Page<WpUser> searchWpUserByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<WpUser> searchWpUserByParams(@Param("map") Map<String, String> map);

	List<WpUser> loginUser(@Param("map") Map<String, String> map);
} 
