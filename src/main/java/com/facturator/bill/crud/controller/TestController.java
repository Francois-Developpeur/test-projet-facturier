package com.facturator.bill.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facturator.bill.crud.entity.Produit;
import com.facturator.bill.crud.service.ProductService;

@RestController
@RequestMapping("/test")
public class TestController {
	
	//fais le lien avec le service
	
	@Autowired
	private ProductService productService;
		
	@PostMapping("/listeproduit")
	//post http://localhost:8080/test/listeproduit
	public Produit saveProduit(@RequestBody Produit pro) {
		Produit newProduct = productService.saveProduct(pro);
		return newProduct;
	}
	
	@GetMapping("/listeproduit")
	//get http://localhost:8080/test/listeproduit
	public List<Produit> allProduct() {
		List<Produit> listAllProduct = productService.allProduct();
		return listAllProduct;
	}
	
	@GetMapping("/listeproduit/{pReference}")
	//get  http://localhost:8080/test/listeproduit/3
	public Produit trouverId(@PathVariable int pReference) {
		Produit nouveauProduit = productService.trouverId(pReference);
		return nouveauProduit;
	}
	
	@DeleteMapping("/listeproduit/{pReference}")
	public void supprimer(@PathVariable("pReference") int id) {
		//supprimer produit 
		//delete http://localhost:8080/test/listeproduit/3
		productService.supprimer(id);
	}
	
	@PutMapping("/listeproduit")
	public Produit update(@RequestBody Produit pro) {
		//mise a jour produit
		// put http://localhost:8080/test/listeproduit
		productService.saveProduct(pro);
		return pro;
		
		
	}
	
}


//requestbody lier la requete json a l'entité que je vise