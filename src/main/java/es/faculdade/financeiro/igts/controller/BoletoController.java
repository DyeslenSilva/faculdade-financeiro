package es.faculdade.financeiro.igts.controller;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.faculdade.financeiro.igts.cobranca.GerandoBoleto;
import es.faculdade.financeiro.igts.model.Boleto;
import es.faculdade.financeiro.igts.repo.BoletoRepo;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/boletoAPI")
public class BoletoController {

	@Autowired
	private GerandoBoleto geraBoleto;
	
	private BoletoRepo boletoRepo;
	
	@GetMapping("/boletoAluno")
	public Optional<Boleto> gerandoBoleto(@PathVariable Integer idBoleto){
		geraBoleto.gerandoBoleto();
		return boletoRepo.findById(idBoleto);
	}
	
}
