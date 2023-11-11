package com.vincent.liteFlow.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "liteflow_chain")
public class LiteflowChain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String applicationName;
    private String chainName;
    private String chainDesc;
    @Column(columnDefinition = "text")
    private String elData;
    @Column(columnDefinition = "datetime")
    private Date createTime;
}
