package com.intDesign.homeHub.core.models;


import com.intDesign.homeHub.core.interfaces.Identifier;

import java.util.List;

public class Provider extends Identifier {
    private String providerName;
    private String providerAddress;
    private String providerEmail;
    private String providerPhone;
    private List<MaterialInformation> materialInformations;

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderAddress() {
        return providerAddress;
    }

    public void setProviderAddress(String providerAddress) {
        this.providerAddress = providerAddress;
    }

    public String getProviderEmail() {
        return providerEmail;
    }

    public void setProviderEmail(String providerEmail) {
        this.providerEmail = providerEmail;
    }

    public String getProviderPhone() {
        return providerPhone;
    }

    public void setProviderPhone(String providerPhone) {
        this.providerPhone = providerPhone;
    }

    public List<MaterialInformation> getMaterialInformations() {
        return materialInformations;
    }

    public void setMaterialInformations(List<MaterialInformation> materialInformations) {
        this.materialInformations = materialInformations;
    }
}
