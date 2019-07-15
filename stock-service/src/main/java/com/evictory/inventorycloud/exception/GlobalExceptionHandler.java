package com.evictory.inventorycloud.exception;

import com.evictory.inventorycloud.modal.ResponseMessages;
import com.evictory.inventorycloud.modal.ResponseValues;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
    @Autowired
    ExceptionResponse exceptionResponse;

    @Autowired
    ResponseValues responseValues;

    @Autowired
    ResponseMessages responseMessages;

    @ExceptionHandler(JsonMappingException.class)
    public ResponseEntity<ExceptionResponse> serviceExceptionHandler(JsonMappingException e){
    	
        exceptionResponse.setMessage("Invalide value format in json body");
        exceptionResponse.setCode("Serialize code");
        exceptionResponse.setData(e.toString());
        return new ResponseEntity<>(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @ExceptionHandler(MessageBodyConstraintViolationException.class)
    public ResponseEntity<?> serviceException(MessageBodyConstraintViolationException e){
        responseValues.setStatus(responseMessages.getResponseFailed());
        responseValues.setMessage(e.getMessage());
        responseValues.setCode("#1200003");
        return new ResponseEntity<>(responseValues,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionResponse> serviceExceptionFromModel(MethodArgumentNotValidException ex){
    	String message = "Please provide ";
		
		for (int i = 0; i < ex.getBindingResult().getAllErrors().size(); i++) {
			
			if(i == 0) {
				message = message + ex.getBindingResult().getAllErrors().get(i).getDefaultMessage();
			}else {
				message = message +" & " + ex.getBindingResult().getAllErrors().get(i).getDefaultMessage() ;
			}
		}
    	
    	exceptionResponse.setMessage(message);
        exceptionResponse.setCode("Serialize code");
        exceptionResponse.setData(ex.toString());
        return new ResponseEntity<>(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
