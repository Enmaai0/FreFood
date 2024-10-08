package icu.hao.haomall.model.pojo;

import java.util.Date;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_order.id
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_order.order_no
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private Integer orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_order.user_id
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_order.total_price
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private Integer totalPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_order.receiver_name
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private String receiverName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_order.receiver_mobile
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private String receiverMobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_order.receiver_address
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private String receiverAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_order.order_status
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private Integer orderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_order.postage
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private Integer postage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_order.payment_type
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private Integer paymentType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_order.delivery_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private Date deliveryTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_order.pay_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private Date payTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_order.end_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_order.create_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hao_mall_order.update_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_order.id
     *
     * @return the value of hao_mall_order.id
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_order.id
     *
     * @param id the value for hao_mall_order.id
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_order.order_no
     *
     * @return the value of hao_mall_order.order_no
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_order.order_no
     *
     * @param orderNo the value for hao_mall_order.order_no
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_order.user_id
     *
     * @return the value of hao_mall_order.user_id
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_order.user_id
     *
     * @param userId the value for hao_mall_order.user_id
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_order.total_price
     *
     * @return the value of hao_mall_order.total_price
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public Integer getTotalPrice() {
        return totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_order.total_price
     *
     * @param totalPrice the value for hao_mall_order.total_price
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_order.receiver_name
     *
     * @return the value of hao_mall_order.receiver_name
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_order.receiver_name
     *
     * @param receiverName the value for hao_mall_order.receiver_name
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_order.receiver_mobile
     *
     * @return the value of hao_mall_order.receiver_mobile
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_order.receiver_mobile
     *
     * @param receiverMobile the value for hao_mall_order.receiver_mobile
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_order.receiver_address
     *
     * @return the value of hao_mall_order.receiver_address
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_order.receiver_address
     *
     * @param receiverAddress the value for hao_mall_order.receiver_address
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_order.order_status
     *
     * @return the value of hao_mall_order.order_status
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_order.order_status
     *
     * @param orderStatus the value for hao_mall_order.order_status
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_order.postage
     *
     * @return the value of hao_mall_order.postage
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public Integer getPostage() {
        return postage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_order.postage
     *
     * @param postage the value for hao_mall_order.postage
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setPostage(Integer postage) {
        this.postage = postage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_order.payment_type
     *
     * @return the value of hao_mall_order.payment_type
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_order.payment_type
     *
     * @param paymentType the value for hao_mall_order.payment_type
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_order.delivery_time
     *
     * @return the value of hao_mall_order.delivery_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_order.delivery_time
     *
     * @param deliveryTime the value for hao_mall_order.delivery_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_order.pay_time
     *
     * @return the value of hao_mall_order.pay_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_order.pay_time
     *
     * @param payTime the value for hao_mall_order.pay_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_order.end_time
     *
     * @return the value of hao_mall_order.end_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_order.end_time
     *
     * @param endTime the value for hao_mall_order.end_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_order.create_time
     *
     * @return the value of hao_mall_order.create_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_order.create_time
     *
     * @param createTime the value for hao_mall_order.create_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hao_mall_order.update_time
     *
     * @return the value of hao_mall_order.update_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hao_mall_order.update_time
     *
     * @param updateTime the value for hao_mall_order.update_time
     *
     * @mbg.generated Tue May 21 01:26:00 AEST 2024
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}