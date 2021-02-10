package br.com.bandtec.zoomzinho;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class TodosLivros {
	
	public List<Livro> buscaTema(String tema) {
		System.out.println("Buscando livros com o tema: " + tema);
		List<Livro> livrosEncontrados = new ArrayList<Livro>();
		for(Livro livro : livros()) {
			if(livro.getTema().equals(tema)) {
				livrosEncontrados.add(livro);
			}
		}
		System.out.println("Zoomzinho terminou a busca");
		return livrosEncontrados;
	}
	private List<Livro> livros(){
		List<Livro> livros = new  ArrayList<Livro>();
		livros.add(new Livro("Dominando o Spring Boot", "T.I."));
		livros.add(new Livro("Aprendendo Java", "T.I."));
		livros.add(new Livro("O Escaravelho do Diabo", "aventura."));
		return livros;
	}
}
