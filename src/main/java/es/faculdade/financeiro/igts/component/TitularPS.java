package es.faculdade.financeiro.igts.component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.uol.pagseguro.api.common.domain.builder.HolderBuilder;
import es.faculdade.financeiro.igts.component.model.DocumentoTitular;
import es.faculdade.financeiro.igts.component.model.Titular;

public class TitularPS {
	
	private TelefonePS telefonePS;
	private DocumentoTitularPS documentoTitularPS;
	
	public HolderBuilder toHolderBuilder(Titular titular) {
		HolderBuilder holderBuilder;
		
		holderBuilder = new HolderBuilder()
				.withName(titular.getNome())
				.withPhone(telefonePS.toPhoneBuilder(titular.getTelefone()));
	
		try {
			holderBuilder.withBithDate(new SimpleDateFormat("dd/MM/yyyy")
					.parse(titular.getDataDeAniversario().toString()));
		}catch (ParseException e) {
			e.printStackTrace();
		}
		
		List<DocumentoTitular> documentoTitulars = titular.getDocumetos();
		documentoTitulars.forEach(doc ->{
			holderBuilder.addDocument(
					documentoTitularPS.toDocumentBuilder(doc));
		});
		
		return holderBuilder;
	}

}
