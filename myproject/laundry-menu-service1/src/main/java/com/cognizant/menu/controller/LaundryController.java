package com.cognizant.menu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.menu.exception.LaundryServiceNotFoundException;
import com.cognizant.menu.model.LaundryModel;
import com.cognizant.menu.service.LaundryService;

@RestController
@RequestMapping({"/laundryService"})
public class LaundryController {

	@Autowired
	private LaundryService lService;
	
//	@PostMapping("/createservice")
//	public LaundryModel createService(@Valid @RequestBody LaundryModel lm) {
//		return lService.save(lm);
//	}
	
	@GetMapping("/details")
	public List<LaundryModel> getAllServices(){
		List<LaundryModel> lm = lService.getAllDetails();
		System.out.println(lm);
		//return lService.findAll();
		return lm;
		
	}
	
	@GetMapping("/getone/{uid}")
	public Optional<LaundryModel> getOneDetail(@PathVariable(value = "uid")long id) throws LaundryServiceNotFoundException{
//		LaundryModel l = null;
//		for(LaundryModel lm : lService.getAllDetails()) {
//			if(lm.getServiceId() != id) {
//				throw new LaundryServiceNotFoundException(id);
//			}else {
//				l= lService.getOneDetails(id);
//			}
//			
//		}
		return lService.getOneDetails(id);
	}
	
//	@GetMapping("/findById/{id}")
//	public LaundryModel getServiceById(@PathVariable(value = "id") long id) throws LaundryServiceNotFoundException {
//		 LaundryModel lm = lService.findById(id);
//		 if(lm == null) {
//			throw new LaundryServiceNotFoundException(id);
//		 }
//		 return lm;
//	}
	
//	@PutMapping("/update/{id}")
//	public ResponseEntity<LaundryModel> updateService(@PathVariable(value= "id") long id, @Valid @RequestBody LaundryModel lm) throws LaundryServiceNotFoundException{
//		LaundryModel lModel = lService.findById(id);
//		if(lModel == null) {
//			throw new LaundryServiceNotFoundException(id);
//		}
//		lModel.setServiceId(lm.);
//		lModel.setProductName(lm.getProductName());
//		lModel.setServiceType(lm.getServiceType());
//		lModel.setPrice(lm.getPrice());
//		
//		LaundryModel lmupdate = lService.save(lModel);
//		
//		return ResponseEntity.ok().body(lmupdate);
//	}
	
//	@DeleteMapping("/deleteservice/{id}")
//	public ResponseEntity<LaundryModel> deleteService(@PathVariable(value = "id")long id){
//		LaundryModel lm = lService.findById(id);
//		if(lm == null) {
//			return ResponseEntity.notFound().build();
//		}
//		
//		lService.delete(lm);
//		return ResponseEntity.ok().build();
//	}
}

