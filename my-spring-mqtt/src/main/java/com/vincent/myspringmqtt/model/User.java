package com.vincent.myspringmqtt.model;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User implements Serializable {
    private String userName;
    private String userSex;
    private Integer age;
    private String address;
}
