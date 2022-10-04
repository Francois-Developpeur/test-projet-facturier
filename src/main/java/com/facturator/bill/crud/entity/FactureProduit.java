/*package com.facturator.bill.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="facture_produit")	
public class FactureProduit {
	
	@Id
	@ManyToOne
	@JoinColumn(name="fac_numero")
	private int fcNumero;
	
	@Id
	@ManyToOne
	@JoinColumn(name="pro_reference")
	private int fcReference;
	
	@Column(name="fc_quantite")
	private Double fcQuantite;
	
	public FactureProduit() {
		
	}

	public FactureProduit(int fcNumero, int fcReference, Double fcQuantite) {
		this.fcNumero = fcNumero;
		this.fcReference = fcReference;
		this.fcQuantite = fcQuantite;
	}

	public int getFcNumero() {
		return fcNumero;
	}

	public void setFcNumero(int fcNumero) {
		this.fcNumero = fcNumero;
	}

	public int getFcReference() {
		return fcReference;
	}

	public void setFcReference(int fcReference) {
		this.fcReference = fcReference;
	}

	public Double getFcQuantite() {
		return fcQuantite;
	}

	public void setFcQuantite(Double fcQuantite) {
		this.fcQuantite = fcQuantite;
	}

	@Override
	public String toString() {
		return "FactureProduit [fcNumero=" + fcNumero + ", fcReference=" + fcReference + ", fcQuantite=" + fcQuantite
				+ "]";
	}

}
*/