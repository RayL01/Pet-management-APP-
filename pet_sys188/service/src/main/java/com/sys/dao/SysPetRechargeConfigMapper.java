package com.sys.dao;

import com.sys.entity.SysPetRechargeConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysPetRechargeConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pet_recharge_config
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    int deleteByPrimaryKey(Long petRechargeConfigId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pet_recharge_config
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    int insert(SysPetRechargeConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pet_recharge_config
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    int insertSelective(SysPetRechargeConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pet_recharge_config
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    SysPetRechargeConfig selectByPrimaryKey(Long petRechargeConfigId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pet_recharge_config
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    int updateByPrimaryKeySelective(SysPetRechargeConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pet_recharge_config
     *
     * @mbg.generated Thu May 19 11:22:49 GMT+08:00 2022
     */
    int updateByPrimaryKey(SysPetRechargeConfig record);

    List<SysPetRechargeConfig> selectList(@Param("where") String where);
}