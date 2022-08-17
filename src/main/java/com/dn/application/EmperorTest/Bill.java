package com.dn.application.EmperorTest;

public class Bill {

    int billId;
    Long amount;
    Month JAN;
    Home home;

    public Bill() {
    }

    public Bill(int billId, Long amount, Month JAN, Home home) {
        this.billId = billId;
        this.amount = amount;
        this.JAN = JAN;
        this.home = home;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Month getJAN() {
        return JAN;
    }

    public void setJAN(Month JAN) {
        this.JAN = JAN;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }
}
