package br.com.pegorinmoveis.microservico.loja.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.pegorinmoveis.microservico.loja.modelo.Pedido;
import br.com.pegorinmoveis.microservico.loja.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repository;
	
	public List<Pedido> pegarPedidosRealizadosNosUltimosQuinzeDias(){
		Pageable pageable = PageRequest.of(0, 10);
		Page<Pedido> paginaDePedidos =  repository.findByDataMenorQueQuinzeDias(pageable);
		List<Pedido> ListaDePedidos = new ArrayList<>();
		paginaDePedidos.forEach(p -> {
			ListaDePedidos.add(p);
		});
		return ListaDePedidos;
	}
}
