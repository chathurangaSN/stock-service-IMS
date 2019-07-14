package com.evictory.inventorycloud.modal;

import org.springframework.stereotype.Component;


@Component
public class BatchResponseEntity {

    private String status;
    private String message;
    private String code;
    private Batch batche;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Batch getBatche() {
        return batche;
    }

    public void setBatche(Batch batche) {
        this.batche = batche;
    }
}
