package com.br.fornecedorVirtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.fornecedorVirtual.model.InfoFornecedor;
import com.br.fornecedorVirtual.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	@Autowired
	private InfoService infoService;
	
	@RequestMapping("/{estado}")
	public ResponseEntity<InfoFornecedor> pegarInfoPorEstado(@PathVariable String estado) {
		//InfoFornecedor infoFornecedor =  infoService.pegarInfoPorEstado(estado);
		 return new ResponseEntity<>(infoService.pegarInfoPorEstado(estado), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<InfoFornecedor> salvarInfoFornecedor(@RequestBody InfoFornecedor infoFornecedor) {
		return new ResponseEntity<>(infoService.salvarInfoFornecedor(infoFornecedor), HttpStatus.CREATED);
	}

}
