package es.faculdade.financeiro.igts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.faculdade.financeiro.igts.model.Aluno;
import es.faculdade.financeiro.igts.repo.AlunoRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/alunoFinanceiro")
public class AlunoController {

	@Autowired
	private AlunoRepo alunoRepo;
	
	
	@GetMapping("/alunos")
	public Flux<Aluno> getAlunos(){
		return alunoRepo.findAll();
	}
	
	@GetMapping("/aluno/{idAluno}")
	public Mono<Aluno> getAlunoPorId(@PathVariable Integer idAluno){
		return alunoRepo.findById(idAluno);
	}
	
	

}