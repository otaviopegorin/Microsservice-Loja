package br.com.pegorinmoveis.microservico.loja.Dto;

import java.math.BigDecimal;

import br.com.pegorinmoveis.microservico.loja.modelo.Pedido;

public class PedidoDto {

	private String nomeCliente;
	
	private String endereco;
	
	private String nomeProduto;
	
	private int quantidade;
	
	private BigDecimal precoTotal;

	public PedidoDto(String nomeCliente, String endereco, String nomeProduto, int quantidade, BigDecimal precoTotal) {
		this.nomeCliente = nomeCliente;
		this.endereco = endereco;
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.precoTotal = precoTotal;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getnomeDoProduto() {
		return nomeProduto;
	}

	public void setnomeDoProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(BigDecimal precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	public Pedido toPedido() {
		Pedido pedido = new Pedido(this.nomeCliente, this.endereco,this.nomeProduto,this.quantidade,this.precoTotal);
		return pedido;
	}
	
}
