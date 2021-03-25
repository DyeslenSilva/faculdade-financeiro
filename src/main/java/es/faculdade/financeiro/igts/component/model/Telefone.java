package es.faculdade.financeiro.igts.component.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Telefone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 300983144457626175L;
	
	
	private Long idTelefone;
	
	private String codigoArea;
	
	private String numero;

}
