package es.faculdade.financeiro.igts.repo;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import es.faculdade.financeiro.igts.model.Aluno;

public interface AlunoRepo extends R2dbcRepository<Aluno, Integer> {


}
