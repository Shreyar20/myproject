package com.cognizant.menu.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.menu.model.LaundryModel;

@Repository
public interface LaundryRepository extends JpaRepository<LaundryModel, Long>{

//	@Query(value="select * from laundryservice")
//	public List<LaundryModel> findAll();
	
//	public LaundryModel findById(long id);

	
}
