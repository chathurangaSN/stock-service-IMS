package com.evictory.inventorycloud.modal;

public class SaveToMasterEntity {

    Integer id;
    Integer authorizedUserId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAuthorizedUserId() {
        return authorizedUserId;
    }

    public void setAuthorizedUserId(Integer authorizedUserId) {
        this.authorizedUserId = authorizedUserId;
    }
}
