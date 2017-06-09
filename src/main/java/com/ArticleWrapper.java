package com;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArticleWrapper implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("ARTICLE")
	private Article article;

	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	
	
}
