package br.com.farmacia.farmacia.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.farmacia.farmacia.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, String> {

	public List<Categoria> findAllByCategoriaContainingIgnoreCase(String categoria);
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);
		
}
