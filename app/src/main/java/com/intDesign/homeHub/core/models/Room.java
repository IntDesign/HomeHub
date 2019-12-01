package com.intDesign.homeHub.core.models;


import com.intDesign.homeHub.core.interfaces.Identifier;
import com.intDesign.homeHub.infrastructure.graphql.types.RoomType;

import java.util.List;
import java.util.UUID;


public class Room extends Identifier {
    private double lenght;
    private double width;
    private double height;
    private double pc;
    private double atv;
    private double asp;
    private double emptyAsp;
    private double afm;
    private double specialAfm;
    private double customLenght;
    private double customWidth;
    private double customHeightOne;
    private double customHeightTwo;
    private double wallRealCoefficient;
    private double tilesParquetCoefficient;
    private double specialTilesParquetCoefficient;
    private RoomType roomType;
    private UUID houseId;
    private House house;
    private List<RoomJob> roomJobs;
    private List<RoomWallObject> roomWallObjects;

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPc() {
        return pc;
    }

    public void setPc(double pc) {
        this.pc = pc;
    }

    public double getAtv() {
        return atv;
    }

    public void setAtv(double atv) {
        this.atv = atv;
    }

    public double getAsp() {
        return asp;
    }

    public void setAsp(double asp) {
        this.asp = asp;
    }

    public double getEmptyAsp() {
        return emptyAsp;
    }

    public void setEmptyAsp(double emptyAsp) {
        this.emptyAsp = emptyAsp;
    }

    public double getAfm() {
        return afm;
    }

    public void setAfm(double afm) {
        this.afm = afm;
    }

    public double getSpecialAfm() {
        return specialAfm;
    }

    public void setSpecialAfm(double specialAfm) {
        this.specialAfm = specialAfm;
    }

    public double getCustomLenght() {
        return customLenght;
    }

    public void setCustomLenght(double customLenght) {
        this.customLenght = customLenght;
    }

    public double getCustomWidth() {
        return customWidth;
    }

    public void setCustomWidth(double customWidth) {
        this.customWidth = customWidth;
    }

    public double getCustomHeightOne() {
        return customHeightOne;
    }

    public void setCustomHeightOne(double customHeightOne) {
        this.customHeightOne = customHeightOne;
    }

    public double getCustomHeightTwo() {
        return customHeightTwo;
    }

    public void setCustomHeightTwo(double customHeightTwo) {
        this.customHeightTwo = customHeightTwo;
    }

    public double getWallRealCoefficient() {
        return wallRealCoefficient;
    }

    public void setWallRealCoefficient(double wallRealCoefficient) {
        this.wallRealCoefficient = wallRealCoefficient;
    }

    public double getTilesParquetCoefficient() {
        return tilesParquetCoefficient;
    }

    public void setTilesParquetCoefficient(double tilesParquetCoefficient) {
        this.tilesParquetCoefficient = tilesParquetCoefficient;
    }

    public double getSpecialTilesParquetCoefficient() {
        return specialTilesParquetCoefficient;
    }

    public void setSpecialTilesParquetCoefficient(double specialTilesParquetCoefficient) {
        this.specialTilesParquetCoefficient = specialTilesParquetCoefficient;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public UUID getHouseId() {
        return houseId;
    }

    public void setHouseId(UUID houseId) {
        this.houseId = houseId;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public List<RoomJob> getRoomJobs() {
        return roomJobs;
    }

    public void setRoomJobs(List<RoomJob> roomJobs) {
        this.roomJobs = roomJobs;
    }

    public List<RoomWallObject> getRoomWallObjects() {
        return roomWallObjects;
    }

    public void setRoomWallObjects(List<RoomWallObject> roomWallObjects) {
        this.roomWallObjects = roomWallObjects;
    }
}
