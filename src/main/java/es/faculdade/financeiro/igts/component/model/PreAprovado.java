package es.faculdade.financeiro.igts.component.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import br.com.uol.pagseguro.api.common.domain.enums.Currency;
import es.faculdade.financeiro.igts.component.RemessaPS;
import es.faculdade.financeiro.igts.component.RemetentePS;
import lombok.Data;

@Data
public class PreAprovado implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 8598250833865280939L;

	private String redirecionaURL;
	private String notificacaoURL;
	private Currency moeda;
	private BigDecimal precoExtra;
	private String referecia;
	private Remessa remessa;
	private Remetente remetente;
	private RequisicaoPreAprovada requisicaoPreAprovada;
	private Map<String, String> parametros = new HashMap<String, String>();
	
	
}
