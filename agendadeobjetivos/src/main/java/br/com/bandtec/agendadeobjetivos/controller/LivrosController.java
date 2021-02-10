package br.com.bandtec.agendadeobjetivos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.bandtec.agendadeobjetivos.domain.Livraria;
import br.com.bandtec.agendadeobjetivos.domain.Livro;

@RestController
public class LivrosController {
	
	private Livraria livraria;
	
	@Autowired
	public LivrosController(Livraria livraria) {
		this.livraria = livraria;
	}
	
	@GetMapping("/livros/tema/{tema}")
	public ResponseEntity<List<Livro>> buscarLivrosComTema(@PathVariable("tema") String tema){
		List<Livro> livros = livraria.buscarLivroComTema(tema);
		
		if(livros.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		else {
			return ResponseEntity.ok(livros);
		}
	}
}
