package io.github.guifroes.clientes.model.repository;

import io.github.guifroes.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
