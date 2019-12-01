package com.intDesign.homeHub.core.models;

import com.intDesign.homeHub.core.interfaces.Identifier;

import java.util.UUID;

public class MaterialInformation extends Identifier {
    private UUID materialId;
    private double appliedLayers;
    private double consumptionX;
    private double consumptionZ;
    private double unitCover;
    private double productQuantity;
    private double pricePerUnit;
    private UUID providerId;
    private Material material;
    private Provider provider;
    private MaterialExpenditure materialExpenditure;

    public UUID getMaterialId() {
        return materialId;
    }

    public void setMaterialId(UUID materialId) {
        this.materialId = materialId;
    }

    public double getAppliedLayers() {
        return appliedLayers;
    }

    public void setAppliedLayers(double appliedLayers) {
        this.appliedLayers = appliedLayers;
    }

    public double getConsumptionX() {
        return consumptionX;
    }

    public void setConsumptionX(double consumptionX) {
        this.consumptionX = consumptionX;
    }

    public double getConsumptionZ() {
        return consumptionZ;
    }

    public void setConsumptionZ(double consumptionZ) {
        this.consumptionZ = consumptionZ;
    }

    public double getUnitCover() {
        return unitCover;
    }

    public void setUnitCover(double unitCover) {
        this.unitCover = unitCover;
    }

    public double getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(double productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public UUID getProviderId() {
        return providerId;
    }

    public void setProviderId(UUID providerId) {
        this.providerId = providerId;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public MaterialExpenditure getMaterialExpenditure() {
        return materialExpenditure;
    }

    public void setMaterialExpenditure(MaterialExpenditure materialExpenditure) {
        this.materialExpenditure = materialExpenditure;
    }
}
