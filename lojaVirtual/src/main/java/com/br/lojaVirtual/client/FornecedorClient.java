package com.br.lojaVirtual.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.br.lojaVirtual.dto.InfoFornecedorDTO;


@FeignClient("fornecedorVirtual")
public interface FornecedorClient {
	
	@RequestMapping("/info/{estado}")
	InfoFornecedorDTO pegarInfoPorEstado(@PathVariable String estado);

}
