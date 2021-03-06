package br.com.diego.cursomc.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.diego.cursomc.domain.Categoria;
import br.com.diego.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service; //Acessar Serviço
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) { // ResponseEntity<?> = Tipo especial que encapsula as informaçõles de uma resposta http
		
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);		
		
	}

}
