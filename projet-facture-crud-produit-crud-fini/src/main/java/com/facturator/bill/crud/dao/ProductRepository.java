package com.facturator.bill.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facturator.bill.crud.entity.Produit;

public interface ProductRepository extends JpaRepository<Produit, Integer> {


}
