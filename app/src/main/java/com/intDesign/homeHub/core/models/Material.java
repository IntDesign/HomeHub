package com.intDesign.homeHub.core.models;

import com.intDesign.homeHub.core.interfaces.Identifier;

import java.util.UUID;


public class Material extends Identifier {
    private String materialName;
    private UUID roomJobId;
    private RoomJob roomJob;
    private MaterialInformation materialInformation;

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public UUID getRoomJobId() {
        return roomJobId;
    }

    public void setRoomJobId(UUID roomJobId) {
        this.roomJobId = roomJobId;
    }

    public RoomJob getRoomJob() {
        return roomJob;
    }

    public void setRoomJob(RoomJob roomJob) {
        this.roomJob = roomJob;
    }

    public MaterialInformation getMaterialInformation() {
        return materialInformation;
    }

    public void setMaterialInformation(MaterialInformation materialInformation) {
        this.materialInformation = materialInformation;
    }
}
