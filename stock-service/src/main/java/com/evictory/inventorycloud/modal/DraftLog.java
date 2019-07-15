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

import com.evictory.inventorycloud.exception.IntegerNotPassedException;


@Entity
public class DraftLog {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id = 0;

    ZonedDateTime date;
    
    
    @NotNull(message = "valid user information")
    @Min(value = 1 ,message="valid user information")
    Integer userId;
    
    
    @NotNull
    @Size(min=1, message="a reason for the entry log")
    String reason;

    @OneToMany(mappedBy = "draftLog", cascade = CascadeType.ALL)
    List<DraftDetails> draftDetails;

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

	public void setUserId(String userId) {
		 Integer usid = null;
//		try {
             usid = Integer.parseInt(userId);
//        } catch (NumberFormatException e) {
//        	System.out.println("String value passed");
//           throw new  MessageBodyConstraintViolationException("String value passed");
//        }
//		if(usid == null) {
//			System.out.println("String value passed 2");
//	        throw new RuntimeException("Integer type parameter required");
//		}
		this.userId = usid;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public List<DraftDetails> getDraftDetails() {
		return draftDetails;
	}

	public void setDraftDetails(List<DraftDetails> draftDetails) {
		this.draftDetails = draftDetails;
	}

	

    
}
