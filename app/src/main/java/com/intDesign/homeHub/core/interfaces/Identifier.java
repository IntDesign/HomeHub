package com.intDesign.homeHub.core.interfaces;

import java.util.UUID;

public abstract class Identifier {
    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}
