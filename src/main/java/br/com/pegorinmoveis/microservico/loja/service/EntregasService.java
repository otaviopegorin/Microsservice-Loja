package br.com.pegorinmoveis.microservico.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.pegorinmoveis.microservico.loja.Dto.EntregaDto;
import br.com.pegorinmoveis.microservico.loja.Dto.ListaDeEntregas;

@Service
public class EntregasService {

	@Autowired
	private RestTemplate client;
	
	public List<EntregaDto> buscarEntregas(int pagina) {
		ResponseEntity<ListaDeEntregas> exchange = client.exchange("http://transportadora/transportadora/entregas/"+pagina,
				HttpMethod.GET, null, ListaDeEntregas.class);
		return exchange.getBody().getEntregas();
	}

	public int buscarNumeroMaximoDePaginas() {
		ResponseEntity<Integer> exchange = client.exchange("http://transportadora/transportadora/totalDePaginas",
				HttpMethod.GET, null, Integer.class);
		return exchange.getBody();
	}
}
