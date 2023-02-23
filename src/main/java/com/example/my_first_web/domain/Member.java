package com.example.my_first_web.domain;

public class Member {

    private Long id;    //시스템에서 사용할 Id
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}