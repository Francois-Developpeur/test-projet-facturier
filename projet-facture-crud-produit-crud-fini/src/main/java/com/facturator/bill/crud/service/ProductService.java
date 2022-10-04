package com.facturator.bill.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.facturator.bill.crud.dao.ProductRepository;
import com.facturator.bill.crud.entity.Produit;

@Service
public class ProductService {
	
	//fait le lien avec le repo
	
	@Autowired
	private ProductRepository productRepo;
	
	@Transactional
	public Produit saveProduct(Produit pro) {
	
		Produit nouveauProduit = productRepo.save(pro);
		return nouveauProduit;
		
}

	public List<Produit> allProduct(){
			
		List<Produit> allproduct = productRepo.findAll();
		return allproduct;
			
	}
	
	public Produit trouverId(int id) {
		Optional<Produit> resultatId = productRepo.findById(id);
		
		Produit testId = null;
		
		if (resultatId.isPresent()) {
			testId = resultatId.get();
		} else {
			throw new RuntimeException(" je n'ai pas trouvé cette id " + id) ;
			
		}
		return testId;
	}
	
	public void update (Produit pro, int id) {
		productRepo.save(pro);
	}
	
	public void supprimer(int id) {
		productRepo.deleteById(id);
	}

	

	
}
