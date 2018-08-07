package com.bhtcj.jason.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.bhtcj.jason.entity.WpModule;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface WpModuleMapper {

	void insertWpModule(WpModule wpModule);

	void deleteWpModuleByModuleId(Integer moduleId);

	void updateWpModule(WpModule wpModule);

	Page<WpModule> searchWpModuleByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<WpModule> searchWpModuleByParams(@Param("map") Map<String, String> map);

} 
