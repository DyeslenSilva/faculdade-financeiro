package es.faculdade.financeiro.igts.component;

import java.util.Date;

import javax.xml.bind.DatatypeConverter;

import org.springframework.stereotype.Component;

import br.com.uol.pagseguro.api.common.domain.builder.DateRangeBuilder;
import br.com.uol.pagseguro.api.common.domain.builder.PreApprovalRequestBuilder;
import es.faculdade.financeiro.igts.component.model.RequisicaoPreAprovada;

@Component
public class RequisicaoPreAprovadaPS {
	
	@SuppressWarnings("deprecation")
	public PreApprovalRequestBuilder toApprovalRequestBuilder(RequisicaoPreAprovada preAprovada) {
		return new PreApprovalRequestBuilder()
				.withCharge(preAprovada.getCarrega())
				.withName(preAprovada.getNome())
				.withDetails(preAprovada.getDetalhes())
				.withAmountPerPayment(preAprovada.getValorMaximoPercentualPagamento())
				.withMaxTotalAmount(preAprovada.getValorMaximoTotal())
				.withMaxAmountPerPeriod(preAprovada.getValorMaximoPercentualPeriodo())
				.withMaxPaymentsPerPeriod(preAprovada.getPagamentoMaximoPercentualPeriodo())
				.withPeriod(preAprovada.getPeriodo())
				.withDateRange(new DateRangeBuilder()
						.between(new Date(), preAprovada.getDataFinal()));
				
	}
}
