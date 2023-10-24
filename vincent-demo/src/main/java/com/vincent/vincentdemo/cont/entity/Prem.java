package com.vincent.cont.entity;

import lombok.Data;

import java.util.Date;

/**
 * 保费信息
 */
@Data
public class Prem {
    private String contNo;
    private String grpContNo;
    /**
     * 下面三个联合主键 key
     */
	private String polNo;
    /**
     * 责任编码 key
     */
    private String dutyCode;
    /**
     * 缴费计划编码 key,默认 000000， 01 02 代表后面的加费
     */
    private String payPlanCode;

    private Double prem;
    private Double amount;
    private Double standPrem;
    private Double sumPrem;
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
    private Integer mult = 1;
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
