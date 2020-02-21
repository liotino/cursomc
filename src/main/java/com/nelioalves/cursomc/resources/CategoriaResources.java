package com.nelioalves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {
	
	/* ELE JA PEGOU O PRIMEIRO DO CONTROLER
	 * ACHO POR DEFAULT COMO SO TEM ESSE METODO
	 * ELE PEGA ESSE
	 * 
	 * ResponseEntity<?> ele pode ou nao pode encontrar o objeto essa e uma
	 * boa classe porque ela retorna o status
	 * exemple http -> 200 ok e ainda o objeto! mellhor HttServletResponse que so retorna o status do http!
	 */
	
	@Autowired
	private CategoriaService categoriaService;	
		
	
	
	@RequestMapping(value="/{id}" ,method=RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id) {
				
	  Categoria categoria = categoriaService.buscar(id); 	
 
	  return ResponseEntity.ok().body(categoria); 
	  	  
	}
	

}