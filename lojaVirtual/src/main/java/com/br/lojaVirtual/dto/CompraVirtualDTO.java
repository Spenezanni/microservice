package com.br.lojaVirtual.dto;

import java.util.List;

public class CompraVirtualDTO {
	
	private List<ItemDaCompraDTO> itens;
	
	private EnderecoDTO endereco;

	public List<ItemDaCompraDTO> getItens() {
		return itens;
	}

	public void setItens(List<ItemDaCompraDTO> itens) {
		this.itens = itens;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}
	
	

}
