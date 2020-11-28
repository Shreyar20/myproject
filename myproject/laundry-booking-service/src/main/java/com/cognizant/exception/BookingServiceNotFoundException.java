package com.cognizant.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND,reason="Booking not found")
public class BookingServiceNotFoundException extends Exception {

	public BookingServiceNotFoundException(String msg) {
		super(msg);
	}
}
