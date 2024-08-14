package com.mraphaelpy.IvenTrack.Models.Report;

import java.util.Date;
import java.util.UUID;

public class ReportModel {
    UUID id;
    String type; // "LowStock", "Movement", "Inventory"
    String data;
    Date generatedAt;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Date getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(Date generatedAt) {
        this.generatedAt = generatedAt;
    }
}
