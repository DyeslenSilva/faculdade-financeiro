package es.faculdade.financeiro.igts.component.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Titular implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6993974530354231955L;

	
	private String nome;
	
	private Telefone telefone;
	
	private List<DocumentoTitular> documetos;
}
