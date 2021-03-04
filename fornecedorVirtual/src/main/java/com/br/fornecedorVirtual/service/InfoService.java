package com.br.fornecedorVirtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.fornecedorVirtual.model.InfoFornecedor;
import com.br.fornecedorVirtual.repository.InfoRepository;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepository;

	public InfoFornecedor pegarInfoPorEstado(String estado) { 
		return infoRepository.findByEstado(estado);

	}

	public InfoFornecedor salvarInfoFornecedor(InfoFornecedor infoFornecedor) {
		return infoRepository.save(infoFornecedor);
		
	}

}
