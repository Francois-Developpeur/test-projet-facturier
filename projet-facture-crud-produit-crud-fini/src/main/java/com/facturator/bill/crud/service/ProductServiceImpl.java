/*package com.facturator.bill.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturator.bill.crud.dao.ProductRepository;
import com.facturator.bill.crud.entity.Produit;

@Service
public class ProductServiceImpl implements ProductService{
	
		private ProductRepository productRepository;
		
		@Autowired
		public ProductServiceImpl(ProductRepository productRepository) {
			this.productRepository = productRepository;
}
		
		@Override
		public List<Produit> afficher(){
			return productRepository.findAll();
		}
}*/