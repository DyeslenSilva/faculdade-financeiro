package es.faculdade.financeiro.igts.component;

import org.springframework.stereotype.Component;

import br.com.uol.pagseguro.api.common.domain.builder.SenderBuilder;
import es.faculdade.financeiro.igts.component.model.Remetente;

@Component
public class RemetentePS {

	private TelefonePS telefonePS;
	
	public SenderBuilder toSenderBuilder(Remetente remetente) {
		return new SenderBuilder()
				.withEmail(remetente.getEmail())
				.withName(remetente.getNome())
				.withCPF(remetente.getCpf())
				.withHash(remetente.getHash())
				.withPhone(telefonePS.toPhoneBuilder(remetente.getTelefone()));
	}
	
}
