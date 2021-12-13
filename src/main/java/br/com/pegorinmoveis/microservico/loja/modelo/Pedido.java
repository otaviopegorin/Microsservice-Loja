package br.com.pegorinmoveis.microservico.loja.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPedido;
	
	private String nomeCliente;
	
	private String endereco;
	
	private String nomeDoProduto;
	
	private int quantidade;
	
	private BigDecimal precoTotal;

	private LocalDate data;
	
	public Pedido() {}
	
	public Pedido(String nomeCliente, String endereco, String nomeDoProduto, int quantidade, BigDecimal precoTotal) {
		this.nomeCliente = nomeCliente;
		this.endereco = endereco;
		this.nomeDoProduto = nomeDoProduto;
		this.quantidade = quantidade;
		this.precoTotal = precoTotal;
		this.data = LocalDate.now();
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

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
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
	
	public Long getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	
}
