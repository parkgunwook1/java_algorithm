package com.module.module.account_1;

/* 가계부 관리
*
* */

// 수입 지출 항목 클래스
public class Transaction {
    private String date;
    private String category;
    private double amount;

    public Transaction(String date, String category, double amount) {
        this.date = date;
        this.category = category;
        this.amount = amount;
    }
    public String getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }
    public double getAmount() {
        return amount;
    }
}
