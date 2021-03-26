package es.faculdade.financeiro.igts.component;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.uol.pagseguro.api.preapproval.PreApprovalRegistrationBuilder;
import es.faculdade.financeiro.igts.component.model.PreAprovado;
import es.faculdade.financeiro.igts.component.model.Remessa;
import es.faculdade.financeiro.igts.component.model.Remetente;

public class PreAprovadoPS {

	@Autowired
	private RemetentePS remetentePS;
	
	@Autowired
	private RemessaPS remessaPS;
	
	@Autowired
	private RequisicaoPreAprovadaPS preAprovadaPS;
	
	
	public PreApprovalRegistrationBuilder toApprovalRegistrationBuilder(PreAprovado preAprovado) {
		return  new PreApprovalRegistrationBuilder()
				.withCurrency(preAprovado.getMoeda())
				.withExtraAmount(preAprovado.getPrecoExtra())
				.withReference(preAprovado.getReferecia())
				.withSender(remetentePS.toSenderBuilder(preAprovado.getRemetente()))
				.withShipping(remessaPS.toShippingBuilder(preAprovado.getRemessa()))
				.withPreApproval(preAprovadaPS.toApprovalRequestBuilder(preAprovado.getRequisicaoPreAprovada()))
				.withRedirectURL(preAprovado.getRedirecionaURL())
				.withNotificationURL(preAprovado.getNotificacaoURL());
	}
	
}
