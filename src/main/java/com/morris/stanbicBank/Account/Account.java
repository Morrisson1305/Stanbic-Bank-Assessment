package com.morris.stanbicBank.Account;

import com.morris.stanbicBank.Customer.Customer;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Account implements Serializable {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(nullable = false, updatable = false)
    private Long actNumber;
    @Column(nullable = false, updatable = false)
    private double openingAmt;
    private double currentBal;

    @ManyToOne
    private Customer customer;

    public Account(){}

    public Account(Long actNumber, double openingAmt, double currentBal) {
        this.actNumber = actNumber;
        this.openingAmt = openingAmt;
        this.currentBal = currentBal;
    }

    public Long getActNumber() {
        return actNumber;
    }

    public void setActNumber(Long actNumber) {
        this.actNumber = actNumber;
    }

    public double getOpeningAmt() {
        return openingAmt;
    }

    public void setOpeningAmt(double openingAmt) {
        this.openingAmt = openingAmt;
    }

    public double getCurrentBal() {
        return currentBal;
    }

    public void setCurrentBal(double currentBal) {
        this.currentBal = currentBal;
    }

    @Override
    public String toString() {
        return "Account{" +
                "actNumber=" + actNumber +
                ", openingAmt=" + openingAmt +
                ", currentBal=" + currentBal +
                '}';
    }
}
