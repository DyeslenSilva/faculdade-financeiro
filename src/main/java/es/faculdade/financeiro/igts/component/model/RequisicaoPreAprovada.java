package es.faculdade.financeiro.igts.component.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class RequisicaoPreAprovada implements Serializable {

	private static final long serialVersionUID = 7226368099385753819L;


	private String carrega;
	private String detalhes;
	private BigDecimal percentualExtraPagamento;
	private BigDecimal valorMaximoPercentualPagamento;
	private BigDecimal valorMaximoTotal;
	private BigDecimal valorMaximoPercentualPeriodo;
	private Integer pagamentoMaximoPercentualPeriodo;
	private String periodo;
	private Date dataInicial;
	private Date dataFinal;
	private BigDecimal taxaDeAssociacao;
	private Integer tentativaPeriodoDuracao;
	private Expiracao expiracao;
	private String diaDoAno;
	private String diaDoMes;
	private String diaDaSemana;
	private String cancelaUrl;
}