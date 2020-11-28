package com.cognizant.service;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cognizant.exception.BookingServiceNotFoundException;
import com.cognizant.exception.LaundryServiceNotFoundException;
import com.cognizant.exception.UserNotFoundException;
import com.cognizant.exception.UserServiceNotFoundException;
import com.cognizant.model.BookingModel;
import com.cognizant.model.LaundryModel;
import com.cognizant.model.UserModel;
import com.cognizant.repository.BookingRepository;

@Service
public class BookingService {
	@Autowired
	private BookingRepository bRepository;
	
	@Autowired
	RestTemplate restTemplate;
	@Transactional
	public List<BookingModel> getAllBooking() {
		return bRepository.findAll();
	}
	
	@Transactional
	public BookingModel save(BookingModel b) {
		return bRepository.save(b);
	}
	
	@Transactional
	public List<BookingModel> getBookingByUserId(int uid) throws BookingServiceNotFoundException{
		if(!bRepository.getBoookingByUserId(uid).isEmpty()) {
			return bRepository.getBoookingByUserId(uid);
		}else {
			throw new BookingServiceNotFoundException("No Booking present");
		}
	}
//	@Transactional
//	public BookingModel createBooking(BookingModel bm) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> entity = new HttpEntity<String>(headers);
//		LaundryModel body = 
//				restTemplate
//				.exchange("http://localhost:8001/laundryService/" + bm.getServiceId(), HttpMethod.GET, entity, LaundryModel.class);
//		bm.setTotalPrice(totalPrice););
//	}
	

	
//	public String getAllUsers() throws UserNotFoundException{
//		HttpHeaders httHeaders = new HttpHeaders();
//		httHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> entity = new HttpEntity<String>(httHeaders);
//		String users = restTemplate.exchange("http://localhost:8082/userservice/details",
//				HttpMethod.GET, entity, String.class).getBody();
//		if(users == null) {
//			throw new UserNotFoundException("No user Present.");
//		}
//		return users;
//	}
//	@Transactional
//	public List<BookingModel> getBookingByUserId(int userId) throws BookingServiceNotFoundException{
//		if(!bRepository.findUserById(userId).isEmpty())
//			return bRepository.findUserById(userId);
//		else {
//			throw new BookingServiceNotFoundException("No Booking Present");
//		}
//	}
//	
//	public List<BookingModel> getBookingListByUserId(long userId) {
//			return bRepository.findBookingByUserId(userId);
//	}
//	@Transactional
//	public void deleteBookingByUserId(int id)throws BookingServiceNotFoundException{
//		if(!bRepository.findUserById(id).isEmpty()) {
//			bRepository.deleteBookingByUserId(id);
//		}else {
//			throw new BookingServiceNotFoundException("No booking present to delete");
//		}
//	}
////	
//	@Transactional
//	public void deleteSpecificBooking(int userId, int serviceId) throws BookingServiceNotFoundException{
//		List<BookingModel> getBooking = bRepository.findUserById(userId);
//		int flag =0;
//		if(getBooking.isEmpty()) {
//			throw new BookingServiceNotFoundException("No Booking present to delete");
//		}
//		for(BookingModel b: getBooking) {
//			if(b.getServiceId() == serviceId) {
//				bRepository.deleteSpecificUser(userId, serviceId);
//				flag = 1;
//			}
//		}
//		if(flag ==0) {
//			throw new BookingServiceNotFoundException("No Booking present to delete");
//		}
//	}
//
	

	

	 

	
}

