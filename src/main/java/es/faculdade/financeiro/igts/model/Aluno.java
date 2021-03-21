package es.faculdade.financeiro.igts.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAluno;
	
	private String cpf;
	
	private String email;
	
	private String celeuar;
	
	private Calendar dataDeNascimento;
	
	private String nomeDoAluno;
	
	private String curso;
	
	private Double mensalidade;
}
