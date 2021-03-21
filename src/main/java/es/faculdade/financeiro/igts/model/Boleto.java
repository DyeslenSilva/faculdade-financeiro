package es.faculdade.financeiro.igts.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Table
@Entity
@Data
public class Boleto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigoDeBarras;

	
	private String dsescricao;
	
	private BigDecimal valorBoleto;
	
	private String nomeDoBanco;
	
	private String cnpj;
	
	private String razaoSocial;
	
	
	
}
