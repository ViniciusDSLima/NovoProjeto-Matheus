package com.br.projetoSolo.projetoSolo.repository;

import com.br.projetoSolo.projetoSolo.Domain.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
