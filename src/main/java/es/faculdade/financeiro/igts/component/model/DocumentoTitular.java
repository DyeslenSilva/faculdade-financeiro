package es.faculdade.financeiro.igts.component.model;

import java.io.Serializable;

import br.com.uol.pagseguro.api.common.domain.enums.DocumentType;
import lombok.Data;

@Data
public class DocumentoTitular implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private DocumentType tipo;
	private String valor;
	
	
}
