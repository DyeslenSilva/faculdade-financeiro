package es.faculdade.financeiro.igts.component.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class CartaoDeCredito implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5980931328417251384L;

	
	private String token;
	
	private Titular titular;
	
	
}
