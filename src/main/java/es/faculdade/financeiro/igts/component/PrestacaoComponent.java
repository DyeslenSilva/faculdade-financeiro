package es.faculdade.financeiro.igts.component;

import org.springframework.stereotype.Component;

import br.com.uol.pagseguro.api.common.domain.builder.InstallmentBuilder;
import es.faculdade.financeiro.igts.component.model.Prestacao;

@Component
public class PrestacaoComponent {
	
	public InstallmentBuilder toInstallmentBuilder(Prestacao prestacao) {
		return new InstallmentBuilder()
				.withQuantity(prestacao.getQuantidade())
				.withValue(prestacao.getValor());
	}
	

}
