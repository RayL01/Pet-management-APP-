package com.example.petclient.base.entry;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysPetRechargeOrder implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_pet_recharge_order.pet_recharge_order_id
     *
     * @mbg.generated Mon May 23 15:44:07 GMT+08:00 2022
     */
    private Long petRechargeOrderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_pet_recharge_order.member_id
     *
     * @mbg.generated Mon May 23 15:44:07 GMT+08:00 2022
     */
    private Long memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_pet_recharge_order.moneys
     *
     * @mbg.generated Mon May 23 15:44:07 GMT+08:00 2022
     */
    private BigDecimal moneys;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_pet_recharge_order.status
     *
     * @mbg.generated Mon May 23 15:44:07 GMT+08:00 2022
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_pet_recharge_order.create_time
     *
     * @mbg.generated Mon May 23 15:44:07 GMT+08:00 2022
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_pet_recharge_order
     *
     * @mbg.generated Mon May 23 15:44:07 GMT+08:00 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_pet_recharge_order.pet_recharge_order_id
     *
     * @return the value of sys_pet_recharge_order.pet_recharge_order_id
     *
     * @mbg.generated Mon May 23 15:44:07 GMT+08:00 2022
     */
    public Long getPetRechargeOrderId() {
        return petRechargeOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_pet_recharge_order.pet_recharge_order_id
     *
     * @param petRechargeOrderId the value for sys_pet_recharge_order.pet_recharge_order_id
     *
     * @mbg.generated Mon May 23 15:44:07 GMT+08:00 2022
     */
    public void setPetRechargeOrderId(Long petRechargeOrderId) {
        this.petRechargeOrderId = petRechargeOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_pet_recharge_order.member_id
     *
     * @return the value of sys_pet_recharge_order.member_id
     *
     * @mbg.generated Mon May 23 15:44:07 GMT+08:00 2022
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_pet_recharge_order.member_id
     *
     * @param memberId the value for sys_pet_recharge_order.member_id
     *
     * @mbg.generated Mon May 23 15:44:07 GMT+08:00 2022
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_pet_recharge_order.moneys
     *
     * @return the value of sys_pet_recharge_order.moneys
     *
     * @mbg.generated Mon May 23 15:44:07 GMT+08:00 2022
     */
    public BigDecimal getMoneys() {
        return moneys;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_pet_recharge_order.moneys
     *
     * @param moneys the value for sys_pet_recharge_order.moneys
     *
     * @mbg.generated Mon May 23 15:44:07 GMT+08:00 2022
     */
    public void setMoneys(BigDecimal moneys) {
        this.moneys = moneys;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_pet_recharge_order.status
     *
     * @return the value of sys_pet_recharge_order.status
     *
     * @mbg.generated Mon May 23 15:44:07 GMT+08:00 2022
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_pet_recharge_order.status
     *
     * @param status the value for sys_pet_recharge_order.status
     *
     * @mbg.generated Mon May 23 15:44:07 GMT+08:00 2022
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_pet_recharge_order.create_time
     *
     * @return the value of sys_pet_recharge_order.create_time
     *
     * @mbg.generated Mon May 23 15:44:07 GMT+08:00 2022
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_pet_recharge_order.create_time
     *
     * @param createTime the value for sys_pet_recharge_order.create_time
     *
     * @mbg.generated Mon May 23 15:44:07 GMT+08:00 2022
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}