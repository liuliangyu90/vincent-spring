package com.vincent.cont.entity;

import lombok.Data;

import java.util.Date;

/**
 *  合同信息
 */
@Data
public class Cont  {
    /**
     * 保单号 key
     */
	private String contNo;
    /**
     * 团体保单号
     */
    private String grpContNo;
    /**
     * 投保单号
     */
    private String prtNo;
    /**
     * 保单类型，默认为 0 -个单  1 团单 2 -卡单
     */
    private String contType;
    /**
     *  投保人名称
     */
    private String applicationName;
    /**
     * 投保人证件号
     */
    private String applicationNo;
    /**
     * 投保人证件类型
     */
    private String applicationType;
    /**
     * 保单录入日期，默认当前时间
     */
    private Date inputDate;
    /**
     * 保费
     */

    private Double prem;
    /**
     * 保额
     */
    private Double amount;
    /**
     * 缴费期间
     */
    private Date payDate;
    /**
     * 终缴日期
     */
    private Date payyEndDate;
    /**
     * 缴至日期
     */
    private Date payToDate;
    /**
     * 起保日期
     */
    private Date startDate;
    /**
     * 终保日期
     */
    private Date endDate;
    private Date createDate;
    private Date updateDate;
    /**
     * -1 -- 不定期交,
     * 0 -- 趸交,
     * 1 -- 月交
     * 3 -- 季交
     * 6 -- 半年交
     * 12 -- 年交
     */
    private Integer payIntv;
    /**
     * 签单日期
     */
    private Date signDate;
    /**
     * 签单机构
     */
    private String signCom;
    /**
     * 份数
     */
    private Integer mult = 1;
    /**
     * 管理机构
     */
    private String manageCom;
}
