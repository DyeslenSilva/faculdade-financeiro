package es.faculdade.financeiro.igts.component;

import br.com.uol.pagseguro.api.common.domain.builder.PaymentItemBuilder;
import es.faculdade.financeiro.igts.component.model.Produto;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProdutoPS {

	public static PaymentItemBuilder toPaymentItemBuilder(Produto produto) {
		return new PaymentItemBuilder()
				.withId(produto.getIdProduto().toString())
				.withDescription(produto.getDescricao())
				.withAmount(produto.getPreco())
				.withQuantity(produto.getQuantidade())
				.withWeight(produto.getPeso());
	}
	
}
