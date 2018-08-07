package com.bhtcj.jason.vo;

/**
 * 
 * @author jason
 */
public class ModuleRoleVo {
	/**
	 *  
	 */
	private Integer id;
	/**
	 *  模块id
	 */
	private Integer moduleId;
	/**
	 *  角色id
	 */
	private Integer roleId;
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
	 * @param id
	 */
	public void setId(Integer id){
		this.id = id;
	}
	
    /**
     * 
     * @return Integer
     */	
    public Integer getId(){
    	return id;
    }
	/**
	 * 模块id
	 * @param moduleId
	 */
	public void setModuleId(Integer moduleId){
		this.moduleId = moduleId;
	}
	
    /**
     * 模块id
     * @return Integer
     */	
    public Integer getModuleId(){
    	return moduleId;
    }
	/**
	 * 角色id
	 * @param roleId
	 */
	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}
	
    /**
     * 角色id
     * @return Integer
     */	
    public Integer getRoleId(){
    	return roleId;
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
     * @return String
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
     * @return Integer
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
     * @return String
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
     * @return Integer
     */	
    public Integer getModifyPeoleId(){
    	return modifyPeoleId;
    }
}