package com.nelioalves.cursomc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {
	
	/* ELE JA PEGOU O PRIMEIRO DO CONTROLER
	 * ACHO POR DEFAULT COMO SO TEM ESSE METODO
	 * ELE PEGA ESSE
	 */
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		
	  return "Rest esta Funcionando!";	
		
	}

}
