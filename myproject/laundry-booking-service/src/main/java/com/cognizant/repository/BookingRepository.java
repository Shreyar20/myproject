package com.cognizant.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.model.BookingModel;

@Repository
@Transactional
public interface BookingRepository extends JpaRepository<BookingModel, Integer>{
	
	@Query(value = "select c from customer c where c.userid = ?1")
	public List<BookingModel> getBoookingByUserId(int userid);
	
//	@Query(value = "select * from customerbooking where userid= ?1",nativeQuery = true)
//	public List<BookingModel> findUserById(int id);
//	
////	@Query(value = "select * from booking  where user_id= :userid", nativeQuery = true)
////	public List<BookingModel> findBookingByUserId(@Param (value = "userid")long userid);
//	@Modifying
//	@Query(value = "delete from customerbooking cb where cb.userid=?1",nativeQuery = true)
//	public void  deleteBookingByUserId(int userId);
//	
//	@Modifying
//	@Query(value = "delete from customer_booking cb where cb.userid= ?1 and cb.serviceid= ?2" ,nativeQuery = true)
//	public void deleteSpecificUser(int userId,int serviceId);
	
	
}
