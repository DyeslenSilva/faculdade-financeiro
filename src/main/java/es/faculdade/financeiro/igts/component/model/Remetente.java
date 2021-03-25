package es.faculdade.financeiro.igts.component.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Remetente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1201447610698823775L;
	
	
	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private Telefone telefone;
	private String hash;
	

}
