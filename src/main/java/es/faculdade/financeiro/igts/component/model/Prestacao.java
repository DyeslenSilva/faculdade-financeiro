package es.faculdade.financeiro.igts.component.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class Prestacao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer quantidade;
	
	private BigDecimal valor;

}
