package com.sapient.productCatalogue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.productCatalogue.model.Seller;
import com.sapient.productCatalogue.service.SellerService;

@RestController
public class SellerController {

	@Autowired
	SellerService sellerService;
	
	@PostMapping("/seller/save")
	public void save(@RequestBody Seller seller) {
		sellerService.save(seller);
	}
	
	@DeleteMapping("/seller/delete/{id}")
	public void delete(@PathVariable int id) {
		sellerService.delete(id);
	}
	
}
