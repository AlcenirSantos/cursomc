package br.com.foxi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.foxi.domain.Estado;
import br.com.foxi.repositories.EstadoRepository;
import br.com.foxi.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService {
	@Autowired
	private EstadoRepository repo;
	
	public Estado find(Integer id) {
		Optional<Estado> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				 "Objeto não encontrado! Id: " + id + ", Tipo: " + Estado.class.getName()));
	}
	
}
