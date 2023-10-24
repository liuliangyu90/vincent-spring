package com.vincent.cont.entity;

import lombok.Data;

import java.util.Date;

/**
 * 责任
 */
@Data
public class Duty {
    /**
     * 合同号
     */
    private String contNo;
    /**
     * 险种号 key
     */
    private String polNo;
    /**
     * 责任代码 key
     */
    private String dutyCode;

    /**
     * 责任类型：领取责任，一般责任,默认为 0 ，一般责任
     */
    private String dutyType;
    /**
     * 份数
     */
    private Integer mult = 1;
    /**
     * 每期保费，标注保费
     */
    private Double standPrem;
    /**
     * 总保费
     */
    private Double sumPrem;
    /**
     * 责任保费
     */
    private Double prem;
    /**
     * 责任保额
     */
    private Double amount;
    /**
     * 缴费日期
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
