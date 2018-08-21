package com.chen.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "xcx_user")
public class XcxUser {
    /**
     * 表主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户性别(1-男，2-女)
     */
    @Column(name = "user_sex")
    private String userSex;

    /**
     * 用户年龄
     */
    @Column(name = "user_age")
    private Integer userAge;

    /**
     * 就诊卡号
     */
    @Column(name = "medical_card_number")
    private String medicalCardNumber;

    /**
     * 医保卡
     */
    @Column(name = "medical_insurance_card")
    private String medicalInsuranceCard;

    /**
     * 身份证号
     */
    @Column(name = "id_number")
    private String idNumber;

    /**
     * 当前使用手机号
     */
    private String phone;

    /**
     * 账号
     */
    @Column(name = "account_number")
    private String accountNumber;

    /**
     * 密码
     */
    private String password;

    /**
     * 地址省
     */
    private String province;

    /**
     * 详细地址
     */
    @Column(name = "detailed_address")
    private String detailedAddress;

    /**
     * 注册时间
     */
    @Column(name = "registration_time")
    private Date registrationTime;

    /**
     * 最后登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 备用手机号
     */
    @Column(name = "standby_mobile_phone")
    private String standbyMobilePhone;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否删除(1-删除，0-未删除)
     */
    @Column(name = "is_delete")
    private String isDelete;

    /**
     * 注册手机号
     */
    @Column(name = "registered_mobile_phone")
    private String registeredMobilePhone;

    /**
     * 是否认证(1-认证，0-未认证)
     */
    private String authentication;

    /**
     * 医联体ID
     */
    @Column(name = "union_id")
    private Long unionId;

    private String token;

    /**
     * 小程序的openId
     */
    @Column(name = "open_id")
    private String openId;

    /**
     * 市
     */
    private String city;

    /**
     * 县
     */
    private String county;

    /**
     * 获取表主键
     *
     * @return id - 表主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置表主键
     *
     * @param id 表主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户性别(1-男，2-女)
     *
     * @return user_sex - 用户性别(1-男，2-女)
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * 设置用户性别(1-男，2-女)
     *
     * @param userSex 用户性别(1-男，2-女)
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * 获取用户年龄
     *
     * @return user_age - 用户年龄
     */
    public Integer getUserAge() {
        return userAge;
    }

    /**
     * 设置用户年龄
     *
     * @param userAge 用户年龄
     */
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    /**
     * 获取就诊卡号
     *
     * @return medical_card_number - 就诊卡号
     */
    public String getMedicalCardNumber() {
        return medicalCardNumber;
    }

    /**
     * 设置就诊卡号
     *
     * @param medicalCardNumber 就诊卡号
     */
    public void setMedicalCardNumber(String medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    /**
     * 获取医保卡
     *
     * @return medical_insurance_card - 医保卡
     */
    public String getMedicalInsuranceCard() {
        return medicalInsuranceCard;
    }

    /**
     * 设置医保卡
     *
     * @param medicalInsuranceCard 医保卡
     */
    public void setMedicalInsuranceCard(String medicalInsuranceCard) {
        this.medicalInsuranceCard = medicalInsuranceCard;
    }

    /**
     * 获取身份证号
     *
     * @return id_number - 身份证号
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 设置身份证号
     *
     * @param idNumber 身份证号
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * 获取当前使用手机号
     *
     * @return phone - 当前使用手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置当前使用手机号
     *
     * @param phone 当前使用手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取账号
     *
     * @return account_number - 账号
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 设置账号
     *
     * @param accountNumber 账号
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取地址省
     *
     * @return province - 地址省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置地址省
     *
     * @param province 地址省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取详细地址
     *
     * @return detailed_address - 详细地址
     */
    public String getDetailedAddress() {
        return detailedAddress;
    }

    /**
     * 设置详细地址
     *
     * @param detailedAddress 详细地址
     */
    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    /**
     * 获取注册时间
     *
     * @return registration_time - 注册时间
     */
    public Date getRegistrationTime() {
        return registrationTime;
    }

    /**
     * 设置注册时间
     *
     * @param registrationTime 注册时间
     */
    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    /**
     * 获取最后登录时间
     *
     * @return last_login_time - 最后登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastLoginTime 最后登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取备用手机号
     *
     * @return standby_mobile_phone - 备用手机号
     */
    public String getStandbyMobilePhone() {
        return standbyMobilePhone;
    }

    /**
     * 设置备用手机号
     *
     * @param standbyMobilePhone 备用手机号
     */
    public void setStandbyMobilePhone(String standbyMobilePhone) {
        this.standbyMobilePhone = standbyMobilePhone;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否删除(1-删除，0-未删除)
     *
     * @return is_delete - 是否删除(1-删除，0-未删除)
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除(1-删除，0-未删除)
     *
     * @param isDelete 是否删除(1-删除，0-未删除)
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取注册手机号
     *
     * @return registered_mobile_phone - 注册手机号
     */
    public String getRegisteredMobilePhone() {
        return registeredMobilePhone;
    }

    /**
     * 设置注册手机号
     *
     * @param registeredMobilePhone 注册手机号
     */
    public void setRegisteredMobilePhone(String registeredMobilePhone) {
        this.registeredMobilePhone = registeredMobilePhone;
    }

    /**
     * 获取是否认证(1-认证，0-未认证)
     *
     * @return authentication - 是否认证(1-认证，0-未认证)
     */
    public String getAuthentication() {
        return authentication;
    }

    /**
     * 设置是否认证(1-认证，0-未认证)
     *
     * @param authentication 是否认证(1-认证，0-未认证)
     */
    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    /**
     * 获取医联体ID
     *
     * @return union_id - 医联体ID
     */
    public Long getUnionId() {
        return unionId;
    }

    /**
     * 设置医联体ID
     *
     * @param unionId 医联体ID
     */
    public void setUnionId(Long unionId) {
        this.unionId = unionId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 获取小程序的openId
     *
     * @return open_id - 小程序的openId
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置小程序的openId
     *
     * @param openId 小程序的openId
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取县
     *
     * @return county - 县
     */
    public String getCounty() {
        return county;
    }

    /**
     * 设置县
     *
     * @param county 县
     */
    public void setCounty(String county) {
        this.county = county;
    }
}