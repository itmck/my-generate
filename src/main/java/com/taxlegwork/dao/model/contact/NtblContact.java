package com.taxlegwork.dao.model.contact;

import java.util.Date;

public class NtblContact {
    private Long id;

    private Long organizationId;

    private String name;

    private String phone;

    private String headImg;

    private Integer gender;

    private String ageBracket;

    private String weixin;

    private String qq;

    private String department;

    private String position;

    private String positionStatement;

    private String office;

    private Integer serviceWindow;

    private String personStyle;

    private String workStyle;

    private String positonChange;

    private Integer status;

    private Date createTime;

    private Integer manageId;

    private Date modifyTime;

    private Integer modifyId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAgeBracket() {
        return ageBracket;
    }

    public void setAgeBracket(String ageBracket) {
        this.ageBracket = ageBracket == null ? null : ageBracket.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getPositionStatement() {
        return positionStatement;
    }

    public void setPositionStatement(String positionStatement) {
        this.positionStatement = positionStatement == null ? null : positionStatement.trim();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office == null ? null : office.trim();
    }

    public Integer getServiceWindow() {
        return serviceWindow;
    }

    public void setServiceWindow(Integer serviceWindow) {
        this.serviceWindow = serviceWindow;
    }

    public String getPersonStyle() {
        return personStyle;
    }

    public void setPersonStyle(String personStyle) {
        this.personStyle = personStyle == null ? null : personStyle.trim();
    }

    public String getWorkStyle() {
        return workStyle;
    }

    public void setWorkStyle(String workStyle) {
        this.workStyle = workStyle == null ? null : workStyle.trim();
    }

    public String getPositonChange() {
        return positonChange;
    }

    public void setPositonChange(String positonChange) {
        this.positonChange = positonChange == null ? null : positonChange.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getManageId() {
        return manageId;
    }

    public void setManageId(Integer manageId) {
        this.manageId = manageId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getModifyId() {
        return modifyId;
    }

    public void setModifyId(Integer modifyId) {
        this.modifyId = modifyId;
    }
}