package br.com.bandtec.agendadeobjetivos.domain;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Livraria {
	// aqui chama a pasta zoomzinho
	private RestTemplate restTemplate;
	private String url;
	
	public Livraria() {
		restTemplate = new RestTemplate();
		url = "http://localhost:9090/livros/tema/";
	}
	public List<Livro> buscarLivroComTema(String tema){
		String urlBusca = url + tema;
	
		ResponseEntity<List> resposta = restTemplate.getForEntity(urlBusca, List.class);
		return resposta.getBody();
	}
}
