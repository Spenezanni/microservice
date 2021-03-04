package com.br.lojaVirtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.lojaVirtual.client.FornecedorClient;
import com.br.lojaVirtual.dto.CompraVirtualDTO;
import com.br.lojaVirtual.dto.InfoFornecedorDTO;

@Service
public class CompraVirtualService {
	
	/*
	 * @Autowired private RestTemplate client;
	 */
	@Autowired
	private FornecedorClient fornecedorClient;
	
	public void realizarCompra(CompraVirtualDTO compraVirtual) {
		
		InfoFornecedorDTO info = fornecedorClient.pegarInfoPorEstado(compraVirtual.getEndereco().getEstado());
		
		System.out.println(info.getEndereco());

		/*
		 * ResponseEntity<InfoFornecedorDTO> exchange = client.exchange(
		 * "http://fornecedorVirtual/info/" + compraVirtual.getEndereco().getEstado(),
		 * HttpMethod.GET, null, InfoFornecedorDTO.class);
		 * 
		 * System.out.println(exchange.getBody().getEndereco());
		 */

	}

}
