package es.faculdade.financeiro.igts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.faculdade.financeiro.igts.cobranca.GerandoBoleto;

@RestController
@RequestMapping("/boletoAPI")
public class BoletoController {

	@Autowired
	private GerandoBoleto geraBoleto;
	
	@GetMapping("/boletoAluno")
	public ResponseEntity<GerandoBoleto> gerandoBoleto(){
		geraBoleto.gerandoBoleto();
		return ResponseEntity.ok().build();
	}
	
}
