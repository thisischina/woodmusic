package com.hisen.entity;

import java.sql.Timestamp;

/**
 * 用户表
 * Created by weichat:shenweiself on 2017/6/5 0005.
 */
public class User {
    private int id;
    private String code;//唯一识别编码
    private int state;//状态
    private Timestamp creat_time;//注册时间
    private String ext1;//备用1
    private String ext2;//备用2
    private String ext3;//备用3

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Timestamp getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(Timestamp creat_time) {
        this.creat_time = creat_time;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String toString() {
        return "User{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", state=" + state +
                ", creat_time=" + creat_time +
                ", ext1='" + ext1 + '\'' +
                ", ext2='" + ext2 + '\'' +
                ", ext3='" + ext3 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (state != user.state) return false;
        if (code != null ? !code.equals(user.code) : user.code != null) return false;
        if (creat_time != null ? !creat_time.equals(user.creat_time) : user.creat_time != null) return false;
        if (ext1 != null ? !ext1.equals(user.ext1) : user.ext1 != null) return false;
        if (ext2 != null ? !ext2.equals(user.ext2) : user.ext2 != null) return false;
        return ext3 != null ? ext3.equals(user.ext3) : user.ext3 == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + state;
        result = 31 * result + (creat_time != null ? creat_time.hashCode() : 0);
        result = 31 * result + (ext1 != null ? ext1.hashCode() : 0);
        result = 31 * result + (ext2 != null ? ext2.hashCode() : 0);
        result = 31 * result + (ext3 != null ? ext3.hashCode() : 0);
        return result;
    }

}
