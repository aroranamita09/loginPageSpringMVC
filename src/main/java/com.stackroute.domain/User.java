package com.stackroute.domain;

public class User {
    private String username;
    private String password;
    public void setUsername(String username)
    {
        this.username=username;
    }
    public void setPassword()
    {
        this.password=password;
    }
    public String getUsername()
    {
        return username;
    }
    public void getPassword(String password)
    {
        this.password=password;
    }
    public String toString(){
        return this.username+" "+this.password;
    }
}
