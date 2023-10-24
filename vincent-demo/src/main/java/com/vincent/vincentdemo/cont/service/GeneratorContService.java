package com.vincent.cont.service;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.IdcardUtil;
import cn.hutool.core.util.RandomUtil;
import com.vincent.cont.entity.Cont;
import com.vincent.cont.entity.Duty;
import com.vincent.cont.entity.Pol;
import com.vincent.cont.entity.Prem;
import com.vincent.cont.utils.ApiRandom;
import org.springframework.stereotype.Service;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
@Service
public class GeneratorContService {
    /**
     * 险种信息
     */
    private List<String> risks = Arrays.asList("27010001","27020002","18070001","18080003","18080005","88010001","88010002","88010003","88010004","88010005");
    /**
     * 责任编码
     */
    private List<String> dutyCode = Arrays.asList("1001","1002","1003","1004","1005","1006","1007","1008","1009","1010");
    static Snowflake snowflake = IdUtil.getSnowflake(1, 1);;

    public void create(){
        String contNo = snowflake.nextIdStr();
        String grpContNo = snowflake.nextIdStr();
        String prtNo = snowflake.nextIdStr();
        createCont(grpContNo,contNo,prtNo);
    }

    private static Cont createCont(String grpContNo, String contNo, String prtNo) {
        // 自动生成数据
        Cont cont = new Cont();
        cont.setContNo(contNo);
        cont.setGrpContNo(grpContNo);
        cont.setPrtNo(prtNo);
        cont.setContType("1");
        cont.setApplicationName(ApiRandom.getName());
        cont.setApplicationNo(ApiRandom.getIdCard().toString());
        cont.setApplicationType("00");
        cont.setInputDate(new Date());
        cont.setPrem(0.0D);
        cont.setAmount(0.0D);
        cont.setPayDate(new Date());
        cont.setPayyEndDate(new Date());
        cont.setPayToDate(new Date());
        cont.setStartDate(new Date());
        cont.setEndDate(new Date());
        cont.setCreateDate(new Date());
        cont.setUpdateDate(new Date());
        cont.setPayIntv(0);
        cont.setSignDate(new Date());
        cont.setSignCom("");
        return cont;
    }
    private static Pol createPol(String grpContNo, String contNo, String prtNo){
        Pol pol = new Pol();
        pol.setContNo(contNo);
        pol.setGrpContNo(grpContNo);
        pol.setPrtNo(prtNo);
        String polNo = snowflake.nextIdStr();
        pol.setPolNo(polNo);
        pol.setMainPolNo("");
        pol.setInsuredName(ApiRandom.getName());
        StringBuffer idCard = ApiRandom.getIdCard();
        pol.setInsuredSex(IdcardUtil.getGenderByIdCard(idCard.toString()));
        pol.setInsuredAge(IdcardUtil.getAgeByIdCard(idCard.toString()));
        pol.setInsuredPhone(ApiRandom.generatePhoneNum());
        pol.setInsuredAddress("地址信息");
        pol.setInsuredNo(idCard.toString());
        pol.setInsuredType("00");
        pol.setRiskCode("");
        pol.setRiskName("");
        pol.setRiskType("");
        pol.setPrem(0.0D);
        pol.setAmount(0.0D);
        pol.setStandPrem(0.0D);
        pol.setSumPrem(0.0D);
        pol.setPayDate(new Date());
        pol.setPayyEndDate(new Date());
        pol.setPayToDate(new Date());
        pol.setStartDate(new Date());
        pol.setEndDate(new Date());
        return pol;
    }
    private static void createPrem(String grpContNo, String contNo,String polNo){
        Prem prem = new Prem();
        prem.setContNo(contNo);
        prem.setGrpContNo(grpContNo);
        prem.setPolNo(polNo);
        prem.setDutyCode("");
        // 增加加费数据
        prem.setPayPlanCode("000000");
        prem.setPrem(0.0D);
        prem.setAmount(0.0D);
        prem.setStandPrem(0.0D);
        prem.setSumPrem(0.0D);
        prem.setPayDate(new Date());
        prem.setPayyEndDate(new Date());
        prem.setPayToDate(new Date());
        prem.setStartDate(new Date());
        prem.setEndDate(new Date());

    }
    private static Duty createDuty( String contNo,String polNo,String dutyCode){
        Duty duty = new Duty();
        duty.setContNo(contNo);
        duty.setPolNo(polNo);
        duty.setDutyCode(dutyCode);
        duty.setDutyType("0");
        duty.setStandPrem(RandomUtil.randomDouble(100,300,2, RoundingMode.CEILING));
        duty.setSumPrem(0.0D);
        duty.setPrem(RandomUtil.randomDouble(10000,30000,2, RoundingMode.CEILING));
        duty.setAmount(0.0D);
        duty.setPayDate(new Date());
        duty.setPayyEndDate(new Date());
        duty.setPayToDate(new Date());
        duty.setStartDate(new Date());
        duty.setEndDate(new Date());
        return duty;
    }

    public static void main(String[] args) {
        // TODO 生成一般保单数据，生成续期缴费的数据。
        // TODO 通过定时任务每 1 分钟生成一个保单，对应生成续期缴费数据 保单查询界面，按照年，按照月，查询对应保单。根据签单日期查询。这的保单查询放入 list 。考虑内存的问题。
        // TODO 根据 机构、险种编码，生成 当月应收保费数据，当年应收保费数据。做一个界面，一个导出功能。
        // TODO 增加一个通用接口生成对应的保单。接口中可以选择 生成续期保单，还是一次缴费保单。
        // TODO 考虑并发的问题 ？？？
        // TODO 通用生成小订单的，生成大保单
        String contNo = snowflake.nextIdStr();
        String grpContNo = snowflake.nextIdStr();
        String prtNo = snowflake.nextIdStr();
    }
}
