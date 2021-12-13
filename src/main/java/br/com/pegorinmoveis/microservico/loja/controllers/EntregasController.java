package br.com.pegorinmoveis.microservico.loja.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pegorinmoveis.microservico.loja.Dto.EntregaDto;
import br.com.pegorinmoveis.microservico.loja.service.EntregasService;

@RestController
@RequestMapping("/acompanharUltimasEntregas")
public class EntregasController {

	@Autowired
	private EntregasService service;
	
	@CrossOrigin
	@GetMapping("/{pagina}")
	private List<EntregaDto> listaDeProdutos(@PathVariable int pagina) {
		List<EntregaDto> entregas = new ArrayList<>();
		entregas = service.buscarEntregas(pagina);
		return entregas;
	}
	
	@CrossOrigin
	@GetMapping("/totalPaginas")
	private int listaDeProdutos() {
		return service.buscarNumeroMaximoDePaginas();
	}
	
}
