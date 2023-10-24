package com.vincent.cont.entity;

import lombok.Data;

import java.util.Date;

/**
 *  保单
 */
@Data
public class Pol {
    /**
     * 保单号
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
     * 险种号，也叫保单号 key
     */
    private String polNo;
    /**
     * 主线险种号
     */
    private String MainPolNo;
    /**
     * 被保人姓名
     */

    private String insuredName;
    /**
     * 被保人性别，默认 0 男
     */
    private Integer insuredSex;
    /**
     * 被保人年龄
     */
    private Integer insuredAge;
    /**
     * 被保人电话
     */
    private String insuredPhone;
    /**
     * 被保人家庭地址
     */
    private String insuredAddress;
    /**
     * 被保人证件号 ，
     */
    private String insuredNo;
    /**
     * 被保人证件类型，默认 00-身份证
     */
    private String insuredType;
    /**
     * 险种编号
     */
    private String riskCode;
    /**
     * 险种名称
     */
    private String riskName;
    /**
     * 险种类型
     */
    private String riskType;
    /**
     * 保费
     */
    private Double prem;
    private Integer mult = 1;
    /**
     * 保额
     */
    private Double amount;
    /**
     * 每期保费，标注保费
     */
    private Double standPrem;
    /**
     * 总累计保费
     */
    private Double sumPrem;
    /**
     * 首次缴费日期
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
     * 管理机构
     */
    private String manageCom;
}
