package com;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

public class Article implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("ID_ARTICLE")
	private String idArticle;
	
	@JsonProperty("LIB_ARTICLE")
	private String libArticle;
	
	@JsonProperty("PRIX_ARTICLE")
	private BigDecimal prixArticle;

	
	public String getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(String idArticle) {
		this.idArticle = idArticle;
	}

	public String getLibArticle() {
		return libArticle;
	}

	public void setLibArticle(String libArticle) {
		this.libArticle = libArticle;
	}

	public BigDecimal getPrixArticle() {
		return prixArticle;
	}

	public void setPrixArticle(BigDecimal prixArticle) {
		this.prixArticle = prixArticle;
	}
	
	
	
	
	
	
	
}
