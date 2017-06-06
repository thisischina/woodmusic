package com.hisen.entity.info;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by weichat:shenweiself on 2017/6/5 0005.
 */
public class UserInfo {
    private int id;
    private int user_id;
    private String  name;
    private String jieshao;//介绍
    private String sex;//性别
    private Timestamp birthday;//生日
    private String address_code;//地区码
    private String face;//头像
    private List<Object> songsList;//歌单
    private List<Object> fansList;//粉丝
    private Timestamp create_time;//创建时间
    private String ext1;//扩展1
    private String ext2;//扩展2
    private String ext3;//扩展3

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJieshao() {
        return jieshao;
    }

    public void setJieshao(String jieshao) {
        this.jieshao = jieshao;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public String getAddress_code() {
        return address_code;
    }

    public void setAddress_code(String address_code) {
        this.address_code = address_code;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public List<Object> getSongsList() {
        return songsList;
    }

    public void setSongsList(List<Object> songsList) {
        this.songsList = songsList;
    }

    public List<Object> getFansList() {
        return fansList;
    }

    public void setFansList(List<Object> fansList) {
        this.fansList = fansList;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserInfo userInfo = (UserInfo) o;

        if (id != userInfo.id) return false;
        if (user_id != userInfo.user_id) return false;
        if (name != null ? !name.equals(userInfo.name) : userInfo.name != null) return false;
        if (jieshao != null ? !jieshao.equals(userInfo.jieshao) : userInfo.jieshao != null) return false;
        if (sex != null ? !sex.equals(userInfo.sex) : userInfo.sex != null) return false;
        if (birthday != null ? !birthday.equals(userInfo.birthday) : userInfo.birthday != null) return false;
        if (address_code != null ? !address_code.equals(userInfo.address_code) : userInfo.address_code != null)
            return false;
        if (face != null ? !face.equals(userInfo.face) : userInfo.face != null) return false;
        if (songsList != null ? !songsList.equals(userInfo.songsList) : userInfo.songsList != null) return false;
        if (fansList != null ? !fansList.equals(userInfo.fansList) : userInfo.fansList != null) return false;
        if (create_time != null ? !create_time.equals(userInfo.create_time) : userInfo.create_time != null)
            return false;
        if (ext1 != null ? !ext1.equals(userInfo.ext1) : userInfo.ext1 != null) return false;
        if (ext2 != null ? !ext2.equals(userInfo.ext2) : userInfo.ext2 != null) return false;
        return ext3 != null ? ext3.equals(userInfo.ext3) : userInfo.ext3 == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + user_id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (jieshao != null ? jieshao.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (address_code != null ? address_code.hashCode() : 0);
        result = 31 * result + (face != null ? face.hashCode() : 0);
        result = 31 * result + (songsList != null ? songsList.hashCode() : 0);
        result = 31 * result + (fansList != null ? fansList.hashCode() : 0);
        result = 31 * result + (create_time != null ? create_time.hashCode() : 0);
        result = 31 * result + (ext1 != null ? ext1.hashCode() : 0);
        result = 31 * result + (ext2 != null ? ext2.hashCode() : 0);
        result = 31 * result + (ext3 != null ? ext3.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", name='" + name + '\'' +
                ", jieshao='" + jieshao + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", address_code='" + address_code + '\'' +
                ", face='" + face + '\'' +
                ", songsList=" + songsList +
                ", fansList=" + fansList +
                ", create_time=" + create_time +
                ", ext1='" + ext1 + '\'' +
                ", ext2='" + ext2 + '\'' +
                ", ext3='" + ext3 + '\'' +
                '}';
    }
}
