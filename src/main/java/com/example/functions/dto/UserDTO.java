package com.example.functions.dto;

/**
 * @author : mohammad
 * @since : 10/15/2021 6:38 PM , Fri
 * functions
 **/
public class UserDTO
{
    private String username;

    public String getUsername()
    {
        return username;
    }

    public UserDTO setUsername(String username)
    {
        this.username = username;
        return this;
    }

    @Override
    public String toString()
    {
        return "UserDTO{" +
                "username='" + username + '\'' +
                '}';
    }
}
