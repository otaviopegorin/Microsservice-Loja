package br.com.pegorinmoveis.microservico.loja.Dto;

import java.util.ArrayList;
import java.util.List;

public class ListaDeProdutos {

	private List<ProdutosDto> produtos = new ArrayList<>();

	public List<ProdutosDto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutosDto> produtos) {
		this.produtos = produtos;
	}
	
	public void adicionar(ProdutosDto produto) {
		produtos.add(produto);
	}
	
}
