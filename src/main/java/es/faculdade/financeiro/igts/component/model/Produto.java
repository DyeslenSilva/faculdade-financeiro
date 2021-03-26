package es.faculdade.financeiro.igts.component.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idProduto;
	private String descricao;
	private BigDecimal preco;
	private Integer quantidade;
	private Integer peso;
	
}
