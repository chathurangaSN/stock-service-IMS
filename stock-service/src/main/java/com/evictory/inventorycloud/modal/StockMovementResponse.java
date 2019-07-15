package com.evictory.inventorycloud.modal;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StockMovementResponse {

//    private String response;
    //    	private String message;
    private String status;
    private String message;
    private String code;
    private Stock stock;
    private List<TransactionLog> transactionLogsIssue;

    private List<TransactionLog> transactionLogsRecived;

//    public String getResponse() {
//        return response;
//    }
//
//    public void setResponse(String response) {
//        this.response = response;
//    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public List<TransactionLog> getTransactionLogsIssue() {
        return transactionLogsIssue;
    }

    public void setTransactionLogsIssue(List<TransactionLog> transactionLogsIssue) {
        this.transactionLogsIssue = transactionLogsIssue;
    }

    public List<TransactionLog> getTransactionLogsRecived() {
        return transactionLogsRecived;
    }

    public void setTransactionLogsRecived(List<TransactionLog> transactionLogsRecived) {
        this.transactionLogsRecived = transactionLogsRecived;
    }

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
}
