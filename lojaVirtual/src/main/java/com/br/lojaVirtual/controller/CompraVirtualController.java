package com.br.lojaVirtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.lojaVirtual.dto.CompraVirtualDTO;
import com.br.lojaVirtual.service.CompraVirtualService;

@RestController
@RequestMapping("/compra")
public class CompraVirtualController {	
	
	@Autowired
	private CompraVirtualService compraService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void realizarCompraVirtual(@RequestBody CompraVirtualDTO compraVirtual) {
		compraService.realizarCompra(compraVirtual);
	}

}
