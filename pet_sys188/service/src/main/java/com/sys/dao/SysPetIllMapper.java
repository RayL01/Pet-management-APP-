package com.sys.dao;

import com.sys.entity.SysPetIll;

public interface SysPetIllMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pet_ill
     *
     * @mbg.generated Sun Apr 10 15:41:31 GMT+08:00 2022
     */
    int deleteByPrimaryKey(Long petIllId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pet_ill
     *
     * @mbg.generated Sun Apr 10 15:41:31 GMT+08:00 2022
     */
    int insert(SysPetIll record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pet_ill
     *
     * @mbg.generated Sun Apr 10 15:41:31 GMT+08:00 2022
     */
    int insertSelective(SysPetIll record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pet_ill
     *
     * @mbg.generated Sun Apr 10 15:41:31 GMT+08:00 2022
     */
    SysPetIll selectByPrimaryKey(Long petIllId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pet_ill
     *
     * @mbg.generated Sun Apr 10 15:41:31 GMT+08:00 2022
     */
    int updateByPrimaryKeySelective(SysPetIll record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pet_ill
     *
     * @mbg.generated Sun Apr 10 15:41:31 GMT+08:00 2022
     */
    int updateByPrimaryKey(SysPetIll record);
}