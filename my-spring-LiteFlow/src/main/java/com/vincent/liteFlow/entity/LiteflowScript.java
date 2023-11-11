package com.vincent.liteFlow.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "liteflow_script")
public class LiteflowScript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String applicationName;
    private String scriptId;
    private String scriptName;
    @Column(columnDefinition = "text")
    private String scriptData;
    private String scriptType;
    private String scriptLanguage;
    @Column(columnDefinition = "datetime")
    private Date createTime;
}
