package com.pocketmarket.mined.dto;

import java.io.Serializable;

/**
 * Created by markanthonypanizales on 22/07/2017.
 */

public class GlobeOwnerShipDTO implements Serializable {
    private int id;

    private String homeOwnerShip;

    private String homeOwnerShipYears;

    private String homeOwnerShipSalary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHomeOwnerShip() {
        return homeOwnerShip;
    }

    public void setHomeOwnerShip(String homeOwnerShip) {
        this.homeOwnerShip = homeOwnerShip;
    }

    public String getHomeOwnerShipYears() {
        return homeOwnerShipYears;
    }

    public void setHomeOwnerShipYears(String homeOwnerShipYears) {
        this.homeOwnerShipYears = homeOwnerShipYears;
    }

    public String getHomeOwnerShipSalary() {
        return homeOwnerShipSalary;
    }

    public void setHomeOwnerShipSalary(String homeOwnerShipSalary) {
        this.homeOwnerShipSalary = homeOwnerShipSalary;
    }

}
