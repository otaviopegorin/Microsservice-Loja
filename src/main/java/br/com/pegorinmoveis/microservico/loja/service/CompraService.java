package br.com.pegorinmoveis.microservico.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.pegorinmoveis.microservico.loja.Dto.PedidoDto;
import br.com.pegorinmoveis.microservico.loja.modelo.Pedido;
import br.com.pegorinmoveis.microservico.loja.repository.PedidoRepository;

@Service
public class CompraService {

	@Autowired
	private PedidoRepository repository;
	
	
	@Autowired
	private RestTemplate client;
	
	public void novaCompra(PedidoDto pedidoDto,String nome, String quantidade,String endereco ) {
		salvarNovoPedido(pedidoDto);
		baixaNoEstoque(nome, quantidade);
		novaEntrega(nome, endereco);
	}
	private Pedido salvarNovoPedido(PedidoDto pedidoDto) {
		Pedido pedido = pedidoDto.toPedido();
		repository.save(pedido);
		return pedido;
	}
	
	private Boolean baixaNoEstoque(String nome, String quantidade) {
		ResponseEntity<Boolean> exchange = client.exchange("http://catalogo/catalogo/DarBaixaNoEstoque/"+nome+"&"+quantidade+"",
				HttpMethod.GET, null, Boolean.class);
		return exchange.getBody();
	}
	
	private void novaEntrega(String nome, String endereco) {
		ResponseEntity<Boolean> exchange = client.exchange("http://transportadora/transportadora/novaEntrega/"+nome+"&"+endereco+"",
				HttpMethod.GET, null, Boolean.class); 
		
	}
}
