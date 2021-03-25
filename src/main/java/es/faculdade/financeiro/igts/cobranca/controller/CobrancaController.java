package es.faculdade.financeiro.igts.cobranca.controller;

import org.springframework.web.bind.annotation.PathVariable;

import es.faculdade.financeiro.igts.cobranca.CobrancaRepo;
import es.faculdade.financeiro.igts.model.Cobranca;
import reactor.core.publisher.Mono;

public class CobrancaController {

	private CobrancaRepo cobrancaRepo;
	
	public Mono<Cobranca> realizarCobranca(@PathVariable Cobranca cobranca){
		return cobrancaRepo.save(cobranca);
	}
}
