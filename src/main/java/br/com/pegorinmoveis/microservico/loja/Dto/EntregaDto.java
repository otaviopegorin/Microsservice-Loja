package br.com.pegorinmoveis.microservico.loja.Dto;
import java.time.LocalDate;

public class EntregaDto {

	private String status;

	private LocalDate data;

	private String nomeProduto;

	private String enderecoDestinatario;

	private String enderecoRemetente="Rua Miguel Braz Arroteia (59) - Itaju - Sp - Brasil";

	private String codigoDeRastreamento;

	public EntregaDto() {}
	public EntregaDto(String status, String nomeProduto, String enderecoDestinatario, String codigoDeRastreamento) {
		this.status = status;
		this.nomeProduto = nomeProduto;
		this.enderecoDestinatario = enderecoDestinatario;
		this.codigoDeRastreamento = codigoDeRastreamento;
		this.enderecoRemetente="Rua Miguel Braz Arroteia (59) - Itaju - Sp - Brasil";
		this.data = LocalDate.now();
	}
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setIdPedido(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getEnderecoDestinatario() {
		return enderecoDestinatario;
	}

	public void setEnderecoDestinatario(String enderecoDestinatario) {
		this.enderecoDestinatario = enderecoDestinatario;
	}

	public String getEnderecoRemetente() {
		return enderecoRemetente;
	}


	public String getCodigoDeRastreamento() {
		return codigoDeRastreamento;
	}

	public void setCodigoDeRastreamento(String codigoDeRastreamento) {
		this.codigoDeRastreamento = codigoDeRastreamento;
	}

}
