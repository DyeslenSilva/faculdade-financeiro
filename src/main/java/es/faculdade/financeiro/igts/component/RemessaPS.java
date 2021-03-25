package es.faculdade.financeiro.igts.component;

import br.com.uol.pagseguro.api.common.domain.builder.ShippingBuilder;
import es.faculdade.financeiro.igts.component.model.Remessa;

public class RemessaPS {
	
	private EnderecoPS enderecoPS;
	
	public ShippingBuilder toShippingBuilder(Remessa remessa) {
		return new ShippingBuilder()
				.withType(remessa.getType())
				.withCost(remessa.getCusto())
				.withAddress(enderecoPS.toAddressBuilder(remessa.getEndereco()));
	}

}
