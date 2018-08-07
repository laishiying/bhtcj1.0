package com.bhtcj.jason.entity;

/**
 * 
 * @author jason
 */
public class WpRole {
	/**
	 *  
	 */
	private Integer roleId;
	/**
	 *  角色名
	 */
	private String roleName;
	/**
	 *  父级角色ID
	 */
	private String parentRoleId;
	/**
	 *  角色描述
	 */
	private String roleDescription;
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
	 * @param roleId
	 */
	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}
	
    /**
     * 
     * @return
     */	
    public Integer getRoleId(){
    	return roleId;
    }
	/**
	 * 角色名
	 * @param roleName
	 */
	public void setRoleName(String roleName){
		this.roleName = roleName;
	}
	
    /**
     * 角色名
     * @return
     */	
    public String getRoleName(){
    	return roleName;
    }
	/**
	 * 父级角色ID
	 * @param parentRoleId
	 */
	public void setParentRoleId(String parentRoleId){
		this.parentRoleId = parentRoleId;
	}
	
    /**
     * 父级角色ID
     * @return
     */	
    public String getParentRoleId(){
    	return parentRoleId;
    }
	/**
	 * 角色描述
	 * @param roleDescription
	 */
	public void setRoleDescription(String roleDescription){
		this.roleDescription = roleDescription;
	}
	
    /**
     * 角色描述
     * @return
     */	
    public String getRoleDescription(){
    	return roleDescription;
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