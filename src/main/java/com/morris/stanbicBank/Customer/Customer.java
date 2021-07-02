package com.morris.stanbicBank.Customer;

import com.morris.stanbicBank.Account.Account;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity

public class Customer implements Serializable {
    @Id
//    @SequenceGenerator(
//            name = "customer_sequence",
//            sequenceName = "customer_sequence",
//            allocationSize = 1
//    )
    @GeneratedValue(
            strategy = GenerationType.AUTO
//            generator = "customer_sequence"
    )
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private LocalDate dob;
    @Column(nullable = false, updatable = false)
    private String email;
    private String phoneNum;

    @OneToMany(mappedBy = "customer")
    private List<Account> accounts;
//    private LocalDate dateCreated;


    public Customer(){}


    public Customer(String name, LocalDate dob, String email, String phoneNum) {
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.phoneNum = phoneNum;
//        this.dateCreated = dateCreated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}

