package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nelioalves.cursomc.domain.Cidade;


/* param JpaRepository
 * 1.objeto do dominio
 * 2.Tipo primitivo que tem a chave primaria
 */


@Repository
public interface CidadeRepository extends JpaRepository<Cidade,Integer>  {




}
