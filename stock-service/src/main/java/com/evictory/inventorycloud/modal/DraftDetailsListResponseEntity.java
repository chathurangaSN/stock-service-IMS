package com.evictory.inventorycloud.modal;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DraftDetailsListResponseEntity {

    private String status;
    private String message;
    private String code;
    private List<DraftDetails> draftDetails;

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

    public List<DraftDetails> getDraftDetails() {
        return draftDetails;
    }

    public void setDraftDetails(List<DraftDetails> draftDetails) {
        this.draftDetails = draftDetails;
    }
}
