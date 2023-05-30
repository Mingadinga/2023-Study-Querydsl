package com.example.querydsl.dto;

import lombok.Data;

@Data
public class MemberSearchCondition {
    private String userName;
    private String teamName;
    private Integer ageGoe; // 이 나이 이상
    private Integer ageLoe; // 이 나이 이하
}
