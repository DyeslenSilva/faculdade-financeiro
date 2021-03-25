package es.faculdade.financeiro.igts.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Cobranca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCobranca;
	
	private String descricao;

}
