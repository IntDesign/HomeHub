package com.intDesign.homeHub.core.models;

import com.intDesign.homeHub.core.interfaces.Identifier;

import java.util.UUID;

public class MaterialExpenditure extends Identifier {
    private UUID materialInformationId;
    private double totalPrice;
    private double totalQuantity;
    private double totalPackets;
    private MaterialInformation materialInformation;

    public UUID getMaterialInformationId() {
        return materialInformationId;
    }

    public void setMaterialInformationId(UUID materialInformationId) {
        this.materialInformationId = materialInformationId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(double totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public double getTotalPackets() {
        return totalPackets;
    }

    public void setTotalPackets(double totalPackets) {
        this.totalPackets = totalPackets;
    }

    public MaterialInformation getMaterialInformation() {
        return materialInformation;
    }

    public void setMaterialInformation(MaterialInformation materialInformation) {
        this.materialInformation = materialInformation;
    }
}
