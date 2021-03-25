package es.faculdade.financeiro.igts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class Pagamentos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPagamento;
	
	@OneToMany(targetEntity = Aluno.class)
	private Integer idAluno;
}