package com.bhtcj.jason.entity;

/**
 * 
 * @author jason
 */
public class WpModule {
	/**
	 *  
	 */
	private Integer moduleId;
	/**
	 *  模块名称
	 */
	private String moduleName;
	/**
	 *  父级模块ID
	 */
	private String parentModuleId;
	/**
	 *  模块的URL
	 */
	private String moduleUrl;
	/**
	 *  模块描述
	 */
	private String moduleDescription;
	/**
	 *  创建时间
	 */
	private String creationTime;
	/**
	 *  创建人id
	 */
	private Integer creationPeopleId;
	/**
	 *  修改时间
	 */
	private String modifyTime;
	/**
	 *  修改人id
	 */
	private Integer modifyPeoleId;
	/**
	 * 
	 * @param moduleId
	 */
	public void setModuleId(Integer moduleId){
		this.moduleId = moduleId;
	}
	
    /**
     * 
     * @return
     */	
    public Integer getModuleId(){
    	return moduleId;
    }
	/**
	 * 模块名称
	 * @param moduleName
	 */
	public void setModuleName(String moduleName){
		this.moduleName = moduleName;
	}
	
    /**
     * 模块名称
     * @return
     */	
    public String getModuleName(){
    	return moduleName;
    }
	/**
	 * 父级模块ID
	 * @param parentModuleId
	 */
	public void setParentModuleId(String parentModuleId){
		this.parentModuleId = parentModuleId;
	}
	
    /**
     * 父级模块ID
     * @return
     */	
    public String getParentModuleId(){
    	return parentModuleId;
    }
	/**
	 * 模块的URL
	 * @param moduleUrl
	 */
	public void setModuleUrl(String moduleUrl){
		this.moduleUrl = moduleUrl;
	}
	
    /**
     * 模块的URL
     * @return
     */	
    public String getModuleUrl(){
    	return moduleUrl;
    }
	/**
	 * 模块描述
	 * @param moduleDescription
	 */
	public void setModuleDescription(String moduleDescription){
		this.moduleDescription = moduleDescription;
	}
	
    /**
     * 模块描述
     * @return
     */	
    public String getModuleDescription(){
    	return moduleDescription;
    }
	/**
	 * 创建时间
	 * @param creationTime
	 */
	public void setCreationTime(String creationTime){
		this.creationTime = creationTime;
	}
	
    /**
     * 创建时间
     * @return
     */	
    public String getCreationTime(){
    	return creationTime;
    }
	/**
	 * 创建人id
	 * @param creationPeopleId
	 */
	public void setCreationPeopleId(Integer creationPeopleId){
		this.creationPeopleId = creationPeopleId;
	}
	
    /**
     * 创建人id
     * @return
     */	
    public Integer getCreationPeopleId(){
    	return creationPeopleId;
    }
	/**
	 * 修改时间
	 * @param modifyTime
	 */
	public void setModifyTime(String modifyTime){
		this.modifyTime = modifyTime;
	}
	
    /**
     * 修改时间
     * @return
     */	
    public String getModifyTime(){
    	return modifyTime;
    }
	/**
	 * 修改人id
	 * @param modifyPeoleId
	 */
	public void setModifyPeoleId(Integer modifyPeoleId){
		this.modifyPeoleId = modifyPeoleId;
	}
	
    /**
     * 修改人id
     * @return
     */	
    public Integer getModifyPeoleId(){
    	return modifyPeoleId;
    }
}