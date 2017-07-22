package com.pocketmarket.mined.dto;

import java.io.Serializable;

/**
 * Created by markanthonypanizales on 22/07/2017.
 */

public class GlobeUserDTO implements Serializable {
    private int id;

    private String salutation;

    private String gender;

    private String month;

    private String day;

    private String year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
