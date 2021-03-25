package es.faculdade.financeiro.igts.component;

import org.springframework.stereotype.Component;

import br.com.uol.pagseguro.api.common.domain.builder.DocumentBuilder;
import es.faculdade.financeiro.igts.component.model.DocumentoTitular;

@Component
public class DocumentoTitularPS {

	public DocumentBuilder toDocumentBuilder(DocumentoTitular documentoTitular) {
		return new DocumentBuilder()
				.withType(documentoTitular.getTipo())
				.withValue(documentoTitular.getValor());
	}
}
