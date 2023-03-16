package uea.pagamentos_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import uea.pagamentos_api.moldes.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}