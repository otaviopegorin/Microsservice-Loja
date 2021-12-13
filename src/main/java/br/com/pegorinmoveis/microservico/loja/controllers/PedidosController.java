package br.com.pegorinmoveis.microservico.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pegorinmoveis.microservico.loja.modelo.Pedido;
import br.com.pegorinmoveis.microservico.loja.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {

	@Autowired
	private PedidoService service;
	
	@CrossOrigin
	@GetMapping
	public List<Pedido> Comprar() {
		List<Pedido> pedidos = service.pegarPedidosRealizadosNosUltimosQuinzeDias();
		return pedidos;
	}
}
