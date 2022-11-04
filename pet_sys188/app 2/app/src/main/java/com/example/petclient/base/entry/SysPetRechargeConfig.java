package com.example.petclient.base.entry;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysPetRechargeConfig implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_pet_recharge_config.pet_recharge_config_id
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    private Long petRechargeConfigId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_pet_recharge_config.moneys
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    private BigDecimal moneys;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_pet_recharge_config.create_time
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_pet_recharge_config.vip_id
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    private Long vipId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_pet_recharge_config
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_pet_recharge_config.pet_recharge_config_id
     *
     * @return the value of sys_pet_recharge_config.pet_recharge_config_id
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    public Long getPetRechargeConfigId() {
        return petRechargeConfigId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_pet_recharge_config.pet_recharge_config_id
     *
     * @param petRechargeConfigId the value for sys_pet_recharge_config.pet_recharge_config_id
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    public void setPetRechargeConfigId(Long petRechargeConfigId) {
        this.petRechargeConfigId = petRechargeConfigId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_pet_recharge_config.moneys
     *
     * @return the value of sys_pet_recharge_config.moneys
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    public BigDecimal getMoneys() {
        return moneys;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_pet_recharge_config.moneys
     *
     * @param moneys the value for sys_pet_recharge_config.moneys
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    public void setMoneys(BigDecimal moneys) {
        this.moneys = moneys;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_pet_recharge_config.create_time
     *
     * @return the value of sys_pet_recharge_config.create_time
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_pet_recharge_config.create_time
     *
     * @param createTime the value for sys_pet_recharge_config.create_time
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_pet_recharge_config.vip_id
     *
     * @return the value of sys_pet_recharge_config.vip_id
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    public Long getVipId() {
        return vipId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_pet_recharge_config.vip_id
     *
     * @param vipId the value for sys_pet_recharge_config.vip_id
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    public void setVipId(Long vipId) {
        this.vipId = vipId;
    }
}