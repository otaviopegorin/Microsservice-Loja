package br.com.pegorinmoveis.microservico.loja.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.pegorinmoveis.microservico.loja.modelo.Pedido;

@Repository
public interface PedidoRepository extends PagingAndSortingRepository<Pedido, Long>{

	@Query(value = "SELECT * FROM pedido where data >= CURRENT_DATE - 15 order by data desc", nativeQuery = true)
	Page<Pedido> findByDataMenorQueQuinzeDias(Pageable pageable);

	
}
