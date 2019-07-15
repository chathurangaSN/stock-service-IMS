package com.evictory.inventorycloud.modal;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TransactionDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String itemCode;
	private Double quantity;
	private String batchId;

	@ManyToOne
    @JoinColumn(name = "transactionLogId")
    @JsonIgnore
    TransactionLog transactionlog;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public Integer getItemId() {
//		return itemId;
//	}
//
//	public void setItemId(Integer itemId) {
//		this.itemId = itemId;
//	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

//	public Integer getUomId() {
//		return uomId;
//	}
//
//	public void setUomId(Integer uomId) {
//		this.uomId = uomId;
//	}
//
//	public Integer getBrandId() {
//		return brandId;
//	}
//
//	public void setBrandId(Integer brandId) {
//		this.brandId = brandId;
//	}

	public TransactionLog getTransactionlog() {
		return transactionlog;
	}

	public void setTransactionlog(TransactionLog transactionlog) {
		this.transactionlog = transactionlog;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
}