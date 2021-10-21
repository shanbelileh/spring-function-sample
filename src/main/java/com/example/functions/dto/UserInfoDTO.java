package com.example.functions.dto;

/**
 * @author : mohammad
 * @since : 10/16/2021 6:40 PM , Sat
 * functions
 **/
public class UserInfoDTO
{
    private String username;
    private String name;
    private int age;

    public String getUsername()
    {
        return username;
    }

    public UserInfoDTO setUsername(String username)
    {
        this.username = username;
        return this;
    }

    public String getName()
    {
        return name;
    }

    public UserInfoDTO setName(String name)
    {
        this.name = name;
        return this;
    }

    public int getAge()
    {
        return age;
    }

    public UserInfoDTO setAge(int age)
    {
        this.age = age;
        return this;
    }
}
