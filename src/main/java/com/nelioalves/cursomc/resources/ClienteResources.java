package com.nelioalves.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Cliente;
import com.nelioalves.cursomc.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResources {
	
	/* ELE JA PEGOU O PRIMEIRO DO CONTROLER
	 * ACHO POR DEFAULT COMO SO TEM ESSE METODO
	 * ELE PEGA ESSE
	 * 
	 * ResponseEntity<?> ele pode ou nao pode encontrar o objeto essa e uma
	 * boa classe porque ela retorna o status
	 * exemple http -> 200 ok e ainda o objeto com Body!! mellhor HttServletResponse que so retorna o status do http!
	 * 
	 * SEMPRE EM RESOURCES OS METODOS SAO CURTOS! ou seja nas apis metodos curtos
	 * 
	 */
	
	@Autowired
	private ClienteService clienteService;	
	
	
	
	@RequestMapping(value="/{id}" ,method=RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id) {
				
	  Cliente categoria = clienteService.buscar(id); 	
 
	  return ResponseEntity.ok().body(categoria); 
	  	  
	}
	

}