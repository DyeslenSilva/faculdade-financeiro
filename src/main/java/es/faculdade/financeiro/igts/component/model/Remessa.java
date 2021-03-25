package es.faculdade.financeiro.igts.component.model;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.uol.pagseguro.api.common.domain.ShippingType;
import lombok.Data;

@Data
public class Remessa implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -4862105889843372085L;

	private ShippingType.Type type;
	
	private BigDecimal custo;
	
	private Endereco endereco;
}
