package com.dgmusic;

import java.io.Serializable;

public class User implements Serializable {

    private String firsName ;
    private String lastName ;
    private int age;
    private String comName ;

    public  User(){

    }
    public User(String firsName,String lastName,int age,String comName) {
        this.firsName=firsName;
        this.lastName=lastName;
        this.age=age;
        this.comName=comName;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }
}
