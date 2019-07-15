package com.evictory.inventorycloud.modal;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class StockListResponseEntity {

    private String status;
    private String message;
    private String code;
    private List<Stock> stocks;

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

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }
}
