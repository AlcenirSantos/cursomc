package br.com.foxi.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.foxi.domain.Endereco;
import br.com.foxi.services.EnderecoService;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoResource {
	
	@Autowired
	private EnderecoService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<Endereco> find(@PathVariable Integer id) {
		
		Endereco obj = service.find(id);

		return ResponseEntity.ok().body(obj);
	}
	
}
