package es.faculdade.financeiro.igts.cobranca;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import es.faculdade.financeiro.igts.model.Cobranca;
import reactor.core.publisher.Mono;

public interface CobrancaRepo extends R2dbcRepository<Cobranca, Integer> {

	public Mono<Cobranca> updateCobranca(Cobranca cobranca);
}
