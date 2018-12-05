package com.wwb.demo.entity;

import java.util.Date;

public class Action {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_action.action_id
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    private Integer actionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_action.action_name
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    private String actionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_action.icon
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    private String icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_action.title
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_action.list_url
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    private String listUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_action.action_url
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    private String actionUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_action.order_index
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    private Integer orderIndex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_action.role_ids
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    private String roleIds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_action.user_id
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_action.status
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_action.create_user_id
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    private Integer createUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_action.create_time
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_action.update_user_id
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    private Integer updateUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_action.update_time
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_action
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public Action(Integer actionId, String actionName, String icon, String title, String listUrl, String actionUrl, Integer orderIndex, String roleIds, Integer userId, Integer status, Integer createUserId, Date createTime, Integer updateUserId, Date updateTime) {
        this.actionId = actionId;
        this.actionName = actionName;
        this.icon = icon;
        this.title = title;
        this.listUrl = listUrl;
        this.actionUrl = actionUrl;
        this.orderIndex = orderIndex;
        this.roleIds = roleIds;
        this.userId = userId;
        this.status = status;
        this.createUserId = createUserId;
        this.createTime = createTime;
        this.updateUserId = updateUserId;
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_action
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public Action() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_action.action_id
     *
     * @return the value of t_action.action_id
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public Integer getActionId() {
        return actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_action.action_id
     *
     * @param actionId the value for t_action.action_id
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_action.action_name
     *
     * @return the value of t_action.action_name
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_action.action_name
     *
     * @param actionName the value for t_action.action_name
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_action.icon
     *
     * @return the value of t_action.icon
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_action.icon
     *
     * @param icon the value for t_action.icon
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_action.title
     *
     * @return the value of t_action.title
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_action.title
     *
     * @param title the value for t_action.title
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_action.list_url
     *
     * @return the value of t_action.list_url
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public String getListUrl() {
        return listUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_action.list_url
     *
     * @param listUrl the value for t_action.list_url
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public void setListUrl(String listUrl) {
        this.listUrl = listUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_action.action_url
     *
     * @return the value of t_action.action_url
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public String getActionUrl() {
        return actionUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_action.action_url
     *
     * @param actionUrl the value for t_action.action_url
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_action.order_index
     *
     * @return the value of t_action.order_index
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public Integer getOrderIndex() {
        return orderIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_action.order_index
     *
     * @param orderIndex the value for t_action.order_index
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_action.role_ids
     *
     * @return the value of t_action.role_ids
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public String getRoleIds() {
        return roleIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_action.role_ids
     *
     * @param roleIds the value for t_action.role_ids
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_action.user_id
     *
     * @return the value of t_action.user_id
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_action.user_id
     *
     * @param userId the value for t_action.user_id
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_action.status
     *
     * @return the value of t_action.status
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_action.status
     *
     * @param status the value for t_action.status
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_action.create_user_id
     *
     * @return the value of t_action.create_user_id
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_action.create_user_id
     *
     * @param createUserId the value for t_action.create_user_id
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_action.create_time
     *
     * @return the value of t_action.create_time
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_action.create_time
     *
     * @param createTime the value for t_action.create_time
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_action.update_user_id
     *
     * @return the value of t_action.update_user_id
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_action.update_user_id
     *
     * @param updateUserId the value for t_action.update_user_id
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_action.update_time
     *
     * @return the value of t_action.update_time
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_action.update_time
     *
     * @param updateTime the value for t_action.update_time
     *
     * @mbggenerated Wed Dec 05 17:19:23 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}