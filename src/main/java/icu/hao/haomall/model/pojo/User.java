package icu.hao.haomall.model.pojo;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_user.id
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_user.username
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_user.password
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_user.personalized_signature
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private String personalizedSignature;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_user.role
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private Integer role;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_user.create_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_user.update_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_user.id
     *
     * @return the value of hao_mall_user.id
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_user.id
     *
     * @param id the value for hao_mall_user.id
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_user.username
     *
     * @return the value of hao_mall_user.username
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_user.username
     *
     * @param username the value for hao_mall_user.username
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_user.password
     *
     * @return the value of hao_mall_user.password
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_user.password
     *
     * @param password the value for hao_mall_user.password
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_user.personalized_signature
     *
     * @return the value of hao_mall_user.personalized_signature
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_user.personalized_signature
     *
     * @param personalizedSignature the value for hao_mall_user.personalized_signature
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature == null ? null : personalizedSignature.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_user.role
     *
     * @return the value of hao_mall_user.role
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public Integer getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_user.role
     *
     * @param role the value for hao_mall_user.role
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_user.create_time
     *
     * @return the value of hao_mall_user.create_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_user.create_time
     *
     * @param createTime the value for hao_mall_user.create_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_user.update_time
     *
     * @return the value of hao_mall_user.update_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_user.update_time
     *
     * @param updateTime the value for hao_mall_user.update_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}