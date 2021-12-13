package br.com.pegorinmoveis.microservico.loja.Dto;

import java.math.BigDecimal;


public class ProdutosDto {

	private String nome;

	private String categoria;

	private BigDecimal valor;

	private int quantidade;

	private String urlImagem;
	
	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public ProdutosDto() {}
	public ProdutosDto(String nome, String categoria, BigDecimal valor, int quantidade, String urlImagem) {
		this.nome = nome;
		this.categoria = categoria.toString();
		this.valor = valor;
		this.quantidade = quantidade;
		this.urlImagem = urlImagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}