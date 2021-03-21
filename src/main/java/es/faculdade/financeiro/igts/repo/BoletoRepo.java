package es.faculdade.financeiro.igts.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import es.faculdade.financeiro.igts.model.Boleto;

public interface BoletoRepo extends JpaRepository<Boleto, Integer> {

}
