package com.intDesign.homeHub.core.models;

import com.intDesign.homeHub.core.interfaces.Identifier;
import com.intDesign.homeHub.infrastructure.graphql.types.RoomObjectType;

import java.util.UUID;


public class RoomWallObject extends Identifier {
    private UUID roomId;
    private RoomObjectType type;
    private double lenght;
    private double width;
    private double area;
    private int number;
    private Room room;

    public UUID getRoomId() {
        return roomId;
    }

    public void setRoomId(UUID roomId) {
        this.roomId = roomId;
    }

    public RoomObjectType getType() {
        return type;
    }

    public void setType(RoomObjectType type) {
        this.type = type;
    }

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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
