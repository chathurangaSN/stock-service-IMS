package com.evictory.inventorycloud.service;

import java.util.List;

import com.evictory.inventorycloud.modal.SaveToMasterEntity;
import org.springframework.http.ResponseEntity;

import com.evictory.inventorycloud.modal.DraftLog;
import com.evictory.inventorycloud.modal.Stock;
import com.evictory.inventorycloud.modal.DraftDetails;

public interface StockService {


	ResponseEntity<?> saveAll(DraftLog draftLog); // save all stock details with log

	ResponseEntity<?> fetchAll(); // get all stock details with log

	ResponseEntity<?> saveEntry(DraftLog draftLog); // save only stock log

	ResponseEntity<?> updateEntry(Integer id, DraftLog draftLog); // update stock log // pass id of stock log

	ResponseEntity<?> fetchEntry(Integer id); // get stock log  // pass id of stock log

	ResponseEntity<?> deleteEntry(Integer id); // delete stock log  // pass id of stock log

	ResponseEntity<?> saveDetails(Integer id, DraftDetails details); // create stock details for respective stock log // pass id of stock log

	ResponseEntity<?> updateDetails(Integer id, DraftDetails details); // update stock details for respective stock log // pass id of stock details

	ResponseEntity<?> deleteDetails(Integer id); // delete stock details // pass id of stock details

	ResponseEntity<?> fetchAllDetails(Integer id); // fetch all stock details by stock log // pass id of stock details

	ResponseEntity<?> deleteAllDetails(Integer id); // delete all stock details for stock log // pass stock log id

	ResponseEntity<?> saveToMaster(SaveToMasterEntity saveToMasterEntity);  // fetch all draft log entry details and push it as a new entry to stock log and delete if existing draft log

	List<Stock> fetchAllMaster(); // fetch all permanent added stock entries with details
	
	Stock fetchMaster(Integer id); // fetch  permanent added stock entries with details by id
	
	Stock fetchMasterLastEntry(String date); // fetch  the last entry on open stock by date 
	
	ResponseEntity<?> fetchStockMovementReport(Integer itemId); //,Integer uomId,Integer brandId

}
