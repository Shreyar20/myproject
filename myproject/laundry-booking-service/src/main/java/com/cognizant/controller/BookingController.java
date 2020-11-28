package com.cognizant.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cognizant.exception.BookingServiceNotFoundException;
import com.cognizant.model.BookingModel;
import com.cognizant.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {
	@Autowired
	private BookingService bService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/details")
	public List<BookingModel> getAllList(){
		return bService.getAllBooking();
	}
	
	@GetMapping("/{uid}")
	public List<BookingModel> getBookingByUserId(@PathVariable(value = "uid") int uid) throws BookingServiceNotFoundException{
		return bService.getBookingByUserId(uid);
	}
	
//	@PostMapping("/createservice")
//	public BookingModel createService(@Valid @RequestBody BookingModel bm) {
//		return bService.save(bm);
//	}
	
//	@GetMapping("/findbooingbyuserid/{uid}")
//	public List<BookingModel> getuserById(@PathVariable (value= "uid") int id) throws BookingServiceNotFoundException {
//		
//		
//		return bService.getBookingByUserId(id);
//	}
//	@GetMapping("/findBookingByUser/{uid}")
//	public List<BookingModel> getBookingListByUserId(@PathVariable (value="uid")long uid) throws UserServiceNotFoundException{
//		List<BookingModel> bm = bService.getBookingListByUserId(uid);
//		if(bm.isEmpty()) {
//			throw new UserServiceNotFoundException(uid);
//		}
//		return bm;
//	}
//	@GetMapping("/findBookingListbyUser/{uid}")
//	public String getBookingByUserId(@PathVariable (value= "uid")long userid) throws UserServiceNotFoundException {
//		List<BookingModel> bookingList = getBookingListByUserId(userid);
//		String booking= "";
//		HttpHeaders httHeaders = new HttpHeaders();
//		httHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> entity = new HttpEntity<String>(httHeaders);
//		
//		for(BookingModel bm: bookingList) {
//			UserModel users = restTemplate.exchange("http://localhost:8082/userservice/details"+bm.getUserId(),
//					HttpMethod.GET, entity, UserModel.class).getBody();
//			
//			booking = booking +  "{BookingId: "+ bm.getBookingId()+
//					", UserName: "+users.getUserName()+", UserAddress: "+users.getAddress()
//					+", PhoneNo: "+users.getPhoneNo()+ " }";
//		}
//		
//		return booking;
//	}
	
	
	
//	@DeleteMapping("/deletebookingbyuserid/{uid}")
//	public void deleteBookingByUserId(@PathVariable (value= "uid") int id) throws BookingServiceNotFoundException{
//		
//		bService.deleteBookingByUserId(id);	}
//	
//	@DeleteMapping("/deletespecificbooking/{uid}/{sid}")
//	public void deleteSpecificBooking(@PathVariable (value="uid")int userId,
//			@PathVariable (value="sid")int serviceId)
//			throws BookingServiceNotFoundException {
//				bService.deleteSpecificBooking(userId, serviceId);
//	}
}
