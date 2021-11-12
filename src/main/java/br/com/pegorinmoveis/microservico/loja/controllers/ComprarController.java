package br.com.pegorinmoveis.microservico.loja.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pegorinmoveis.microservico.loja.Dto.PedidoDto;

@RestController
@RequestMapping("/comprar")
public class ComprarController {


	
	@PostMapping
	public void Comprar(@RequestBody PedidoDto pedidoDto) {
		//compraService.realizaCompra(pedidoDto);
	}
}
