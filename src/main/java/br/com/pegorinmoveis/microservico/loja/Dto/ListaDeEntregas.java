package br.com.pegorinmoveis.microservico.loja.Dto;

import java.util.ArrayList;
import java.util.List;

public class ListaDeEntregas {
	private List<EntregaDto> entregas = new ArrayList<>();

	public List<EntregaDto> getEntregas() {
		return entregas;
	}

	public void setProdutos(List<EntregaDto> entregas) {
		this.entregas = entregas;
	}
	
	public void adicionar(EntregaDto entrega) {
		entregas.add(entrega);
	}
}
