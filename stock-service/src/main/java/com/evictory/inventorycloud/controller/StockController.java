package com.evictory.inventorycloud.controller;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import javax.management.RuntimeErrorException;
import javax.validation.Valid;

import com.evictory.inventorycloud.modal.*;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.evictory.inventorycloud.exception.MessageBodyConstraintViolationException;
import com.evictory.inventorycloud.service.StockService;

@RestController
@CrossOrigin()
@RequestMapping(value = "/stock")
public class StockController {

	@Autowired
	StockService stockService;

	@RequestMapping(value = "/openstock/draft", method = RequestMethod.POST) // create Draft log with all its respective
																				// details
	public ResponseEntity<?> saveAll(@Valid @RequestBody DraftLog draftLog) {

		return stockService.saveAll(draftLog);

	}

	@RequestMapping(value = "/openstock/draft", method = RequestMethod.GET) // fetch all Draft logs with its respective
																			// stock details
	public ResponseEntity<?> fetchAll() {

		return stockService.fetchAll();
	}

	@RequestMapping(value = "/openstock/draft/entry", method = RequestMethod.POST) // create a new Draft log only
	public ResponseEntity<?> saveEntry(@RequestBody DraftLog draftLog) {

		return stockService.saveEntry(draftLog);

	}

	@RequestMapping(value = "/openstock/draft/entry/{id}", method = RequestMethod.PUT) // update existing Draft details
																						// entry
	public ResponseEntity<?> updateEntry(@PathVariable Integer id, @RequestBody DraftLog draftLog) { // open Draft log
																										// id
		return stockService.updateEntry(id, draftLog);

	}

	@RequestMapping(value = "/openstock/draft/entry/{id}", method = RequestMethod.GET) // fetch a Draft log by id
	public ResponseEntity<?> fetchEntry(@PathVariable Integer id) {

		return stockService.fetchEntry(id);
	}

	@RequestMapping(value = "/openstock/draft/entry/{id}", method = RequestMethod.DELETE) // delete existing Draft log
																							// with its details
	public ResponseEntity<?> deleteEntry(@PathVariable Integer id) {

		return stockService.deleteEntry(id);
	}

	// create a new open Draft detail entry for an existing Draft log
	@RequestMapping(value = "/openstock/draft/details/{id}", method = RequestMethod.POST)
	public ResponseEntity<?> saveDetails(@PathVariable Integer id, @RequestBody DraftDetails draftDetails) {

		return stockService.saveDetails(id, draftDetails);
	}

	// update existing Draft details entry
	@RequestMapping(value = "/openstock/draft/details/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateDetails(@Valid @PathVariable Integer id, @RequestBody DraftDetails details) {

		return stockService.updateDetails(id, details);

	}

	// delete existing Draft details entry
	@RequestMapping(value = "/openstock/draft/details/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteDetails(@PathVariable Integer id) {

		return stockService.deleteDetails(id);
	}

	// fetch all Draft details by Draft log by id
	@RequestMapping(value = "/openstock/draft/detailsAll/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> fetchAllDetails(@PathVariable Integer id) {

		return stockService.fetchAllDetails(id);
	}
	// delete all details of draft details by draft log id
	@RequestMapping(value = "/openstock/draft/detailsAll/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteAllDetails(@PathVariable Integer id) {

		return stockService.deleteAllDetails(id);
	}

	// fetch all draft log entry details and push it as a new entry to stock log and
	// delete if existing draft log
	@RequestMapping(value = "/openstock/master", method = RequestMethod.POST)
	public ResponseEntity<?> saveToMaster(@RequestBody SaveToMasterEntity saveToMasterEntity ) { // draft log id

		return stockService.saveToMaster(saveToMasterEntity);
	}

	@RequestMapping(value = "/openstock/master", method = RequestMethod.GET) // fetch all permanent added stock entries
																				// with details
	public ResponseEntity<?> fetchAllMaster() { // stock log id

		return stockService.fetchAllMaster();
	}

	@RequestMapping(value = "/openstock/master/{id}", method = RequestMethod.GET) // fetch permanent added stock entries
																					// with details by id
	public ResponseEntity<?> fetchMaster(@PathVariable Integer id) { // stock log id

		return stockService.fetchMaster(id);
	}

	@RequestMapping(value = "/openstock/master/{date}/date", method = RequestMethod.GET) // fetch permanent added stock entries
	// with details by id
	public ResponseEntity<?> fetchMasterLastEntry(@PathVariable String date) { // stock log id

		return stockService.fetchMasterLastEntry(date);
	}
	
	@RequestMapping(value = "/openstock/master/stockmovement/{itemId}", method = RequestMethod.GET)
	// fetch Stock Movement Report // {brandId}/{itemId}/{uomId}
	
	public ResponseEntity<?> fetchStockMovement( @PathVariable String itemId) {
//			,@PathVariable Integer uomId, @PathVariable Integer brandId) { 
		
		return stockService.fetchStockMovementReport(itemId);//, uomId, brandId

	}

	@RequestMapping(value = "/batch", method = RequestMethod.GET)
	public ResponseEntity<?> fetchBatch( ) {
		return stockService.fetchAllBatch();

	}

	@RequestMapping(value = "/batch", method = RequestMethod.POST)
	public ResponseEntity<?> saveBatchDetails( @RequestBody Batch batch) {
		return stockService.saveBatch(batch);

	}

	@RequestMapping(value = "/batch/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getBatchById(@PathVariable Integer id ) {
		return stockService.fetchBatchById(id);

	}

	@RequestMapping(value = "/batch/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateBatchDetails(@PathVariable Integer id, @RequestBody Batch batch ) {
		return stockService.updateBatch(id, batch);

	}

	@RequestMapping(value = "/batch/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteBatchDetails( @PathVariable Integer id) {
		return stockService.deleteBatch(id);

	}


}
