package com.nelioalves.cursomc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {
	
	/* ELE JA PEGOU O PRIMEIRO DO CONTROLER
	 * ACHO POR DEFAULT COMO SO TEM ESSE METODO
	 * ELE PEGA ESSE
	 */
	
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
	  Categoria cat1 = new Categoria(1,"informatica");
	  Categoria cat2 = new Categoria(2,"escritorio");
	  
	  List<Categoria> lista = new ArrayList<Categoria>();
	  
	  lista.add(cat1);
	  lista.add(cat2);
	  		
	  return lista;	
		
	}

}
