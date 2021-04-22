package br.com.alura.mvc.mundi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mundi.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

		
}
