package com.bhtcj.jason.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.bhtcj.jason.entity.UserRole;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface UserRoleMapper {

	void insertUserRole(UserRole userRole);

	void deleteUserRoleById(Integer id);

	void updateUserRole(UserRole userRole);

	Page<UserRole> searchUserRoleByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<UserRole> searchUserRoleByParams(@Param("map") Map<String, String> map);

} 
