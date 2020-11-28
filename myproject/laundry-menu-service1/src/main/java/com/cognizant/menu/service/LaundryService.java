package com.cognizant.menu.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.menu.model.LaundryModel;
import com.cognizant.menu.repository.LaundryRepository;

@Service
public class LaundryService {
	
	@Autowired
	private LaundryRepository lRepository;
	
	@Transactional
	public List<LaundryModel> getAllDetails(){
		return lRepository.findAll();
	}
	
	@Transactional
	public Optional<LaundryModel> getOneDetails(long id) {
		return lRepository.findById(id);
	}
	
//	@Transactional
//	public LaundryModel save(LaundryModel l) {
//		return lRepository.save(l);
//	}

//	@Transactional
//	public LaundryModel findById(long id) {
//		return lRepository.findById(id);
//	}
//	
//	public void delete(LaundryModel lm) {
//		lRepository.delete(lm);
//	}
	
	
	
}
