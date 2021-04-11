package com.zzjm.domain;

public class MyStudent {
    private int myid;
    private String myname;
    private String Myemail;
    private int myage;

    public int getMyid() {
        return myid;
    }

    public void setMyid(int myid) {
        this.myid = myid;
    }

    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    public String getMyemail() {
        return Myemail;
    }

    public void setMyemail(String myemail) {
        Myemail = myemail;
    }

    public int getMyage() {
        return myage;
    }

    public void setMyage(int myage) {
        this.myage = myage;
    }

    @Override
    public String toString() {
        return "MyStudent{" +
                "myid=" + myid +
                ", myname='" + myname + '\'' +
                ", Myemail='" + Myemail + '\'' +
                ", myage=" + myage +
                '}';
    }
}
