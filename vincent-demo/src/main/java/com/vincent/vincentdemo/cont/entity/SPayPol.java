package com.vincent.cont.entity;

import lombok.Data;

import java.util.Date;

/**
 * 应收保费险种表，也就保费表
 */
@Data
public class SPayPol {
    /**
     * 保单号
     */
    private String contNo;
    /**
     * 险种编码
     */
    private String polNo;
    /**
     * 责任编码
     */
    private String dutyCode;
    /**
     * 缴费次数
     */
    private Integer PayCount;
    /**
     * 缴费频次
     */
    private Integer PayIntv;
    /**
     * 缴费日期
     */
    private Date payDate;
    /**
     * 原缴费日期，上次缴费日期
     */
    private Date lastPayToDate;
    /**
     * 当前缴费日期
     */
    private String curPayToDate;
    /**
     * 总应交金额
     */
    private double sumDuePayMoney;
    /**
     * 总实际缴费金额
     */
    private double sumActuPayMoney;
    /**
     * 管理机构
     */
    private String manageCom;
}
