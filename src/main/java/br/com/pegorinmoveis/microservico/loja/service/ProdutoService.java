package br.com.pegorinmoveis.microservico.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.pegorinmoveis.microservico.loja.Dto.ListaDeProdutos;
import br.com.pegorinmoveis.microservico.loja.Dto.ProdutosDto;

@Service
public class ProdutoService {

	@Autowired
	private RestTemplate client;
	
	
	public List<ProdutosDto> pegarListaDeProdutos(int pagina){
		
		ResponseEntity<ListaDeProdutos> exchange = client.exchange("http://catalogo/catalogo/"+pagina,
													HttpMethod.GET, null, ListaDeProdutos.class);
		return exchange.getBody().getProdutos();
	}
	public Integer pegarNumeroTotalDePaginas() {
		ResponseEntity<Integer> exchange = client.exchange("http://catalogo/catalogo/totalDePaginas",
				HttpMethod.GET, null, Integer.class);
		return exchange.getBody();
	}
	
	public ProdutosDto pegarProdutoPorNome(String nome) {
		ResponseEntity<ProdutosDto> exchange = client.exchange("http://catalogo/catalogo/BuscarPorNome/"+nome,
				HttpMethod.GET, null, ProdutosDto.class);
		return exchange.getBody();
	}
	
	
}
