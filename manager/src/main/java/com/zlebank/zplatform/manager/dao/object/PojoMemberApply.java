/* 
 * PojoMember.java  
 * 
 * version TODO
 *
 * 2015年9月7日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.manager.dao.object;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;

import com.zlebank.zplatform.member.bean.enums.MemberStatusType;
import com.zlebank.zplatform.member.bean.enums.MemberType;
import com.zlebank.zplatform.member.bean.enums.RealNameLvType;

/**
 * 
 * Member Entity.Copy from zplatform-infrastructure/member
 *
 * @author yangying
 * @version
 * @date 2016年3月4日 上午10:27:55
 * @since 1.3.0
 */
@Entity(name="com.zlebank.zplatform.manager.dao.object.PojoMemberApply")
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="T_MEMBER_APPLY")
    
public  class PojoMemberApply implements Serializable{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -5116602087434506099L;
    /**"主键，标示**/
    private long selfId;
    
    private long memId;
    /**会员ID**/
    private String memberId;
    /**合作机构**/
    private long instiCode;
    /**会员昵称**/
    private String memberName;
    /**登录名**/
    private String loginName;
    /**登录密码**/
    private String pwd;
    /**支付密码**/
    private String payPwd;
    /**实名等级，01-未实名，02-姓名+身份证,03-银行卡校验,04-证件审核**/
    private RealNameLvType realnameLv;
    /**手机**/
    private String phone;
    /**邮箱**/
    private String email;
    /**会员类型，01-个人，02-企业**/
    private MemberType memberType;
    /**会员状态，00-正常，02-冻结，99-注销**/
    private MemberStatusType status;
    /**注册认证，01-手机认证，02-邮箱认证，03-Both**/
    private String registerIdent;
    /**锁定时间**/
    private Date lockTime;
    /**会员注册时间**/
    private Date intTme;
    /**修改时间**/
    private Date upTime;
    @GenericGenerator(name = "id_gen", strategy = "enhanced-table", parameters = {
            @Parameter(name = "table_name", value = "T_C_PRIMAY_KEY"),
            @Parameter(name = "value_column_name", value = "NEXT_ID"),
            @Parameter(name = "segment_column_name", value = "KEY_NAME"),
            @Parameter(name = "segment_value", value = "MEMBER_APPLY_ID"),
            @Parameter(name = "increment_size", value = "1"),
            @Parameter(name = "optimizer", value = "pooled-lo")})
    @Id
    @Column(name="SELF_ID")
    public long getSelfId() {
        return selfId;
    }
    public void setSelfId(long selfId) {
        this.selfId = selfId;
    }
    @Column(name="MEM_ID" ,nullable=false,unique=true)
    public long getMemId() {
        return memId;
    }
    
    public void setMemId(long memId) {
        this.memId = memId;
    }
    @Column(name = "MEMBER_ID")
    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    @Column(name = "INSTI_CODE")
    public long getInstiCode() {
        return instiCode;
    }
    public void setInstiCode(long instiCode) {
        this.instiCode = instiCode;
    }
    @Column(name = "MEMBER_NAME")
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    @Column(name = "LOGIN_NAME")
    public String getLoginName() {
        return loginName;
    }
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    @Column(name = "PWD")
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    @Column(name = "PAY_PWD")
    public String getPayPwd() {
        return payPwd;
    }
    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd;
    }
    @Type(type = "com.zlebank.zplatform.member.pojo.usertype.RealNameLvSqlType")
    @Column(name = "REALNAME_LV")
    public RealNameLvType getRealnameLv() {
        return realnameLv;
    }
    public void setRealnameLv(RealNameLvType realnameLv) {
        this.realnameLv = realnameLv;
    }
    @Column(name = "PHONE")
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Type(type = "com.zlebank.zplatform.member.pojo.usertype.MemberSqlType")
    @Column(name = "MEMBER_TYPE")
    public MemberType getMemberType() {
        return memberType;
    }
    public void setMemberType(MemberType memberType) {
        this.memberType = memberType;
    }
    @Type(type = "com.zlebank.zplatform.member.pojo.usertype.MemberStatusSqlType")
    @Column(name = "STATUS")
    public MemberStatusType getStatus() {
        return status;
    }
    public void setStatus(MemberStatusType status) {
        this.status = status;
    }
    @Column(name = "REGISTER_IDENT")
    public String getRegisterIdent() {
        return registerIdent;
    }
    public void setRegisterIdent(String registerIdent) {
        this.registerIdent = registerIdent;
    }
    @Column(name = "LOCK_TIME")
    public Date getLockTime() {
        return lockTime;
    }
    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }
    @Column(name = "IN_TIME")
    public Date getInTime() {
        return intTme;
    }
    public void setInTime(Date intTme) {
        this.intTme = intTme;
    }
    @Column(name = "UP_TIME")
    public Date getUpTime() {
        return upTime;
    }
    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }
}
