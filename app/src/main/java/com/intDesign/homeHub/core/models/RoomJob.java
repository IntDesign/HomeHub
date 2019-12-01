package com.intDesign.homeHub.core.models;


import com.intDesign.homeHub.core.interfaces.Identifier;
import com.intDesign.homeHub.infrastructure.graphql.types.JobRequestType;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


public class RoomJob extends Identifier {
    private UUID roomId;
    private LocalDateTime startDate;
    private LocalDateTime FinishDate;
    private JobRequestType type;
    private List<Material> materials;
    private Room room;

    public UUID getRoomId() {
        return roomId;
    }

    public void setRoomId(UUID roomId) {
        this.roomId = roomId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getFinishDate() {
        return FinishDate;
    }

    public void setFinishDate(LocalDateTime finishDate) {
        FinishDate = finishDate;
    }

    public JobRequestType getType() {
        return type;
    }

    public void setType(JobRequestType type) {
        this.type = type;
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
