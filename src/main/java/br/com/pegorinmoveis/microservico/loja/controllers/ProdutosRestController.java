package br.com.pegorinmoveis.microservico.loja.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pegorinmoveis.microservico.loja.Dto.ProdutosDto;
import br.com.pegorinmoveis.microservico.loja.service.ProdutoService;

@RestController
@RequestMapping("/catalogo")
public class ProdutosRestController {

	@Autowired
	private ProdutoService service;

	@CrossOrigin
	@GetMapping("/{pagina}")
	private List<ProdutosDto> listaDeProdutos(@PathVariable int pagina, Model model) {
		List<ProdutosDto> produtos = new ArrayList<>();
		produtos = service.pegarListaDeProdutos(pagina);
		return produtos;
	}
	
	@CrossOrigin
	@GetMapping("/totalDePaginas")
	private int totalDePaginas(){
		return service.pegarNumeroTotalDePaginas();
	}
	
	@CrossOrigin
	@GetMapping("/nome/{nome}")
	private ProdutosDto produtoPorNome(@PathVariable String nome) {
		return service.pegarProdutoPorNome(nome);
	}
	
	
}
