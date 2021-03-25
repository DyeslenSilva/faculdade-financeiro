package es.faculdade.financeiro.igts.component;

import org.springframework.stereotype.Component;

import br.com.uol.pagseguro.api.common.domain.builder.PhoneBuilder;
import es.faculdade.financeiro.igts.component.model.Telefone;

@Component
public class TelefonePS {

	public PhoneBuilder toPhoneBuilder(Telefone telefone) {
		return new PhoneBuilder()
				.withAreaCode(telefone.getCodigoArea())
				.withNumber(telefone.getNumero());
	}
}
