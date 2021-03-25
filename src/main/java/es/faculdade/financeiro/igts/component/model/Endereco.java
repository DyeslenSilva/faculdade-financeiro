package es.faculdade.financeiro.igts.component.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Endereco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8646967143111721910L;


	private String codigoPostal;
	private String pais;
	private String estado;
	private String cidade;
	private String complemento;
	private String distrito;
	private String numero;
	private String rua;
}
