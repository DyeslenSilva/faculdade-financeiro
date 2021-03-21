package es.faculdade.financeiro.igts.cobranca;

import org.springframework.stereotype.Component;

import com.boletobancario.boletofacilsdk.BoletoFacil;
import com.boletobancario.boletofacilsdk.enums.BoletoFacilEnvironment;
import com.boletobancario.boletofacilsdk.model.entities.Charge;
import com.boletobancario.boletofacilsdk.model.entities.Payer;
import com.boletobancario.boletofacilsdk.model.response.ChargeResponse;

import es.faculdade.financeiro.igts.model.Aluno;
import es.faculdade.financeiro.igts.model.Boleto;
import lombok.Data;

@Data
public class GerandoBoleto {
	
	
	private String token;
	
	private BoletoFacil boletoFacil = new BoletoFacil(BoletoFacilEnvironment.SANDBOX, token);
	
	private Payer payer = new Payer();
	
	private Charge charge = new Charge();
	
	private Boleto boleto;
	
	private Aluno aluno;
	
	/*
	 * Classe para gerar boletos
	 */
	
	public Charge gerandoBoleto() {
		payer.setName(aluno.getNomeDoAluno());
		payer.setCpfCnpj(aluno.getCpf());
		payer.setEmail(aluno.getEmail());
		payer.setPhone(aluno.getCeleuar());
		payer.setBirthDate(aluno.getDataDeNascimento());
		
		charge.setDescription(boleto.getDsescricao());
		charge.setAmount(boleto.getValorBoleto());
		charge.setPayer(payer);
		
		ChargeResponse chargeResponse = boletoFacil.issueCharge(charge);
		if(chargeResponse.getSuccess()) {
			for(Charge c : chargeResponse.getData().getCharges()) {
				return c;
			}
		}
		
		return null;
	}
}
