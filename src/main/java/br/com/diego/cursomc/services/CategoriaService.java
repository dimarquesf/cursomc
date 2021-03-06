package br.com.diego.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.diego.cursomc.domain.Categoria;
import br.com.diego.cursomc.repositories.CategoriaRepository;
import br.com.diego.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	@Autowired //instaciada automaticamente pelo Spring
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
			Optional<Categoria> obj = repo.findById(id);
			return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		
	}
}

