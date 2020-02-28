package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nelioalves.cursomc.domain.Pagamento;


/* param JpaRepository
 * 
 * 1.objeto do dominio
 * 2.Tipo primitivo que tem a chave primaria
 * 
 * PAGAMENTO E A SUPER CLASSE NAAAOOOOO PRECISA FAZER PARA AS 
 * SUBCLASSES COMO PagamentoComCartao e PagamentoComBotelo JA
 * FAZENDO NAS SUPER CLASSES JA ABRANGE TODAS AS SUBCLASSES
 * 
 */



@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento,Integer>  {


	


}
