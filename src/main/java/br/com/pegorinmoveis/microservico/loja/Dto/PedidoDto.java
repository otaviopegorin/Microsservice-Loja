package br.com.pegorinmoveis.microservico.loja.Dto;

import java.util.List;

public class PedidoDto {

	private List<ProdutoDaCompraDto> itens;
	
	private EnderecoDto endereco;

	public List<ProdutoDaCompraDto> getItens() {
		return itens;
	}

	public void setItens(List<ProdutoDaCompraDto> itens) {
		this.itens = itens;
	}

	public EnderecoDto getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDto endereco) {
		this.endereco = endereco;
	}
}
