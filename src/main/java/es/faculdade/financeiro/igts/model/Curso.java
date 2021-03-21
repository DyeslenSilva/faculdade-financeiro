package es.faculdade.financeiro.igts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCurso;
	
	private String nomeCurso;
	
	private Double mensalidade;
	
	private String tipoCurso;
}