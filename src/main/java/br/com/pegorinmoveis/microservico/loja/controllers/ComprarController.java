package br.com.pegorinmoveis.microservico.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pegorinmoveis.microservico.loja.Dto.PedidoDto;
import br.com.pegorinmoveis.microservico.loja.service.CompraService;

@RestController
@RequestMapping("/comprar")
public class ComprarController {

	@Autowired
	private CompraService service;
	
	@CrossOrigin
	@PostMapping
	public void Comprar(@RequestBody PedidoDto pedidoDto) {
		String quantidade = Integer.toString(pedidoDto.getQuantidade());
		service.novaCompra(pedidoDto, pedidoDto.getnomeDoProduto(), quantidade, pedidoDto.getEndereco());
	}
	
}
