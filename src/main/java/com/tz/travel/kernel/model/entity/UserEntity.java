package com.tz.travel.kernel.model.entity;

/**
 * Created by tzjeefjalft on 12/15/2014.
 */
//@XmlRootElement
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class UserEntity {
    private String userName;
    private String userPw;
    private String email;
    private Integer phoneNumber;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
