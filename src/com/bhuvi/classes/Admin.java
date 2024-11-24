package com.bhuvi.classes;

public class Admin extends User {
    private int userid;

    public Admin() {
    }

    public Admin(int userid, String email, String password) {
        super(email, password);
        this.userid = userid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Admin [userid=" + userid + ", " + super.toString() + "]";
    }
}
