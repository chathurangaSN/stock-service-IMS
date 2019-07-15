package com.evictory.inventorycloud.modal;

import org.springframework.stereotype.Component;

@Component
public class StockResponseEntity {

    private String status;
    private String message;
    private String code;
    private Stock stocks;

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

    public Stock getStocks() {
        return stocks;
    }

    public void setStocks(Stock stocks) {
        this.stocks = stocks;
    }
}
