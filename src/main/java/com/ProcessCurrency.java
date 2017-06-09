package com;

import java.math.BigDecimal;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcessCurrency implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		ArticleWrapper articleWrapper = exchange.getProperty("article", ArticleWrapper.class);
		BigDecimal multiplier = new BigDecimal(exchange.getProperty("changeRate",String.class));
		BigDecimal prixArticle = articleWrapper.getArticle().getPrixArticle();
		articleWrapper.getArticle().setPrixArticle(prixArticle.multiply(multiplier));
	}

}
