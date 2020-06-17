package com.example.qlysinhvien.model;

import java.util.Date;

public class Student {
    private int mID;
    private String mMSSV;
    private String mName;
    private String mEmail;
    private String mNSinh;

    public Student(String mMSSV, String mName, String mEmail, String mNSinh) {
        this.mMSSV = mMSSV;
        this.mName = mName;
        this.mEmail = mEmail;
        this.mNSinh = mNSinh;
    }

    public Student(int mID, String mMSSV, String mName, String mEmail, String mNSinh) {
        this.mID = mID;
        this.mMSSV = mMSSV;
        this.mName = mName;
        this.mEmail = mEmail;
        this.mNSinh = mNSinh;
    }

    public int getmID() {
        return mID;
    }

    public void setmID(int mID) {
        this.mID = mID;
    }

    public String getmMSSV() {
        return mMSSV;
    }

    public void setmMSSV(String mMSSV) {
        this.mMSSV = mMSSV;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmNSinh() {
        return mNSinh;
    }

    public void setmNSinh(String mNSinh) {
        this.mNSinh = mNSinh;
    }
}
