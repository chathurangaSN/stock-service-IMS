package com.evictory.inventorycloud.modal;

import java.time.ZonedDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Stock {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id = 0;

    ZonedDateTime date;
    
    
    @NotNull(message = "valid user information")
    @Min(value = 1 ,message="valid user information")
    Integer authorizedUserId;

    Integer userId;
    
    @NotNull
    @Size(min=1, message="a reason for the entry log")
    String reason;

    @OneToMany(mappedBy = "stock", cascade = CascadeType.ALL)
    List<StockDetails> stockDetails;

	public Stock() {
	}

	public Stock(ZonedDateTime date,
				 Integer authorizedUserId, Integer userId, String reason,
				 List<StockDetails> stockDetails) {

		this.date = date;
		this.authorizedUserId = authorizedUserId;
		this.userId = userId;
		this.reason = reason;
		this.stockDetails = stockDetails;
	}

	public Stock(Integer id, ZonedDateTime date,
				 Integer authorizedUserId, Integer userId, String reason,
				 List<StockDetails> stockDetails) {

		this.id = id;
		this.date = date;
		this.authorizedUserId = authorizedUserId;
		this.userId = userId;
		this.reason = reason;
		this.stockDetails = stockDetails;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ZonedDateTime getDate() {
		return date;
	}

	public void setDate(ZonedDateTime date) {
		this.date = date;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getAuthorizedUserId() {
		return authorizedUserId;
	}

	public void setAuthorizedUserId(Integer authorizedUserId) {
		this.authorizedUserId = authorizedUserId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public List<StockDetails> getStockDetails() {
		return stockDetails;
	}

	public void setStockDetails(List<StockDetails> stockDetails) {
		this.stockDetails = stockDetails;
	}


    
}
