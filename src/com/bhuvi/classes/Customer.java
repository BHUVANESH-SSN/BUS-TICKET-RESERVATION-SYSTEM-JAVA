package com.bhuvi.classes;

public class Customer extends User {
    private int cid;

    public Customer() {
    }

    public Customer(int cid, String email, String password) {
        super(email, password);
        this.cid = cid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Customer [cid=" + cid + ", " + super.toString() + "]";
    }
}
