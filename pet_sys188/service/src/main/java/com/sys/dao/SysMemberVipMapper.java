package com.sys.dao;

import com.sys.entity.SysMemberVip;

public interface SysMemberVipMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_member_vip
     *
     * @mbg.generated Thu May 19 10:43:29 GMT+08:00 2022
     */
    int deleteByPrimaryKey(Long memberVipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_member_vip
     *
     * @mbg.generated Thu May 19 10:43:29 GMT+08:00 2022
     */
    int insert(SysMemberVip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_member_vip
     *
     * @mbg.generated Thu May 19 10:43:29 GMT+08:00 2022
     */
    int insertSelective(SysMemberVip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_member_vip
     *
     * @mbg.generated Thu May 19 10:43:29 GMT+08:00 2022
     */
    SysMemberVip selectByPrimaryKey(Long memberVipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_member_vip
     *
     * @mbg.generated Thu May 19 10:43:29 GMT+08:00 2022
     */
    int updateByPrimaryKeySelective(SysMemberVip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_member_vip
     *
     * @mbg.generated Thu May 19 10:43:29 GMT+08:00 2022
     */
    int updateByPrimaryKey(SysMemberVip record);
}