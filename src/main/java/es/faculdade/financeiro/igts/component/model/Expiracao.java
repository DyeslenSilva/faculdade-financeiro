package es.faculdade.financeiro.igts.component.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Expiracao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Integer valor;
	private String unidade;
	
	
}
