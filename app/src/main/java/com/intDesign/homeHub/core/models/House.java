package com.intDesign.homeHub.core.models;


import com.intDesign.homeHub.core.interfaces.Identifier;

import java.util.List;


public class House extends Identifier {
    private String houseAddress;
    private String ownerName;
    private String ownerPhone;
    private String ownerEmail;
    private List<Room> HouseRooms;

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public List<Room> getHouseRooms() {
        return HouseRooms;
    }

    public void setHouseRooms(List<Room> houseRooms) {
        HouseRooms = houseRooms;
    }
}
