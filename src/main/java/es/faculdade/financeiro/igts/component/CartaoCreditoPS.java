package es.faculdade.financeiro.igts.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.uol.pagseguro.api.common.domain.builder.CreditCardBuilder;
import es.faculdade.financeiro.igts.component.model.CartaoDeCredito;

@Component
public class CartaoCreditoPS {

	@Autowired
	private EnderecoPS enderecoPS;
	
	@Autowired
	private TitularPS titularPS;
	
	@Autowired
	private PrestacaoComponent prestacaoComponent;

	private CreditCardBuilder toCreditCardBuilder(CartaoDeCredito cartaoDeCredito) {
		return new CreditCardBuilder()
				.withBillingAddress(enderecoPS.toAddressBuilder(cartaoDeCredito.getEndereco()))
				.withInstallment(prestacaoComponent.toInstallmentBuilder(cartaoDeCredito.getPrestacao()))
				.withHolder(titularPS.toHolderBuilder(cartaoDeCredito.getTitular()));
	}
	
}