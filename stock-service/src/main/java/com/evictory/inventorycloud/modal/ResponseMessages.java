package com.evictory.inventorycloud.modal;

import org.springframework.stereotype.Component;

@Component
public class ResponseMessages {

    public final String responseSuccess = "Success";
    public final String responseFailed = "Failed";
    public final String messageSuccessPOST = "Succesfully added into database.";
    public final String messageFailedPOST = "Failed to add values into database.";
    public final String messageSuccessGET = "Succesfully withdrawed from database.";
    public final String messageFailedGET = "Failed to withdraw from database.";
    public final String messageSuccessPUT = "Succesfully updated database.";
    public final String messageFailedPUT = "Failed to update database.";
    public final String messageSuccessDELETE = "Succesfully delete from database.";
    public final String messageFailedDELETE = "Failed to Delete from database.";

    public String getResponseSuccess() {
        return responseSuccess;
    }

    public String getResponseFailed() {
        return responseFailed;
    }

    public String getMessageSuccessPOST() {
        return messageSuccessPOST;
    }

    public String getMessageFailedPOST() {
        return messageFailedPOST;
    }

    public String getMessageSuccessGET() {
        return messageSuccessGET;
    }

    public String getMessageFailedGET() {
        return messageFailedGET;
    }

    public String getMessageSuccessPUT() {
        return messageSuccessPUT;
    }

    public String getMessageFailedPUT() {
        return messageFailedPUT;
    }

    public String getMessageSuccessDELETE() {
        return messageSuccessDELETE;
    }

    public String getMessageFailedDELETE() {
        return messageFailedDELETE;
    }
}
