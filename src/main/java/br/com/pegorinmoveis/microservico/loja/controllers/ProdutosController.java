package br.com.pegorinmoveis.microservico.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {

	@GetMapping
	private String Home() {
		return "produtos";
	}
}
