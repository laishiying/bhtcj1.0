package com.bhtcj.jason.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.bhtcj.jason.entity.ModuleRole;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface ModuleRoleMapper {

	void insertModuleRole(ModuleRole moduleRole);

	void deleteModuleRoleById(Integer id);

	void updateModuleRole(ModuleRole moduleRole);

	Page<ModuleRole> searchModuleRoleByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<ModuleRole> searchModuleRoleByParams(@Param("map") Map<String, String> map);

} 
