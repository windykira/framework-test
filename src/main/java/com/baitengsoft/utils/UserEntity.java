package com.baitengsoft.utils;

/**
 * Created by windy on 2018/2/8.
 */
public class UserEntity {

    private String id;
    private String name;
    private String mobile;
    private int age;

    public UserEntity(String mobile){

        this.mobile = mobile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
