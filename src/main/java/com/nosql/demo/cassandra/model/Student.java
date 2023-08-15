package com.nosql.demo.cassandra.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.math.BigInteger;

@Table
public class Student {
    @PrimaryKey
    private int student_id;
    private String student_city;
    private BigInteger student_fees;
    private String student_name;
    private BigInteger student_phone;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_city() {
        return student_city;
    }

    public void setStudent_city(String student_city) {
        this.student_city = student_city;
    }

    public BigInteger getStudent_fees() {
        return student_fees;
    }

    public void setStudent_fees(BigInteger student_fees) {
        this.student_fees = student_fees;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public BigInteger getStudent_phone() {
        return student_phone;
    }

    public void setStudent_phone(BigInteger student_phone) {
        this.student_phone = student_phone;
    }
}
