package com.bhtcj.jason.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.bhtcj.jason.entity.WpRole;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface WpRoleMapper {

	void insertWpRole(WpRole wpRole);

	void deleteWpRoleByRoleId(Integer roleId);

	void updateWpRole(WpRole wpRole);

	Page<WpRole> searchWpRoleByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<WpRole> searchWpRoleByParams(@Param("map") Map<String, String> map);

} 
