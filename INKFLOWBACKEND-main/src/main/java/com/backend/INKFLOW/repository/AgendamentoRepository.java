package com.backend.INKFLOW.repository;

import com.backend.INKFLOW.model.Agendamento;
import com.backend.INKFLOW.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    List<Agendamento> findByCliente(Cliente cliente);
    List<Agendamento> findByStatus(String status);
    List<Agendamento> findByDataHoraBetween(LocalDateTime inicio, LocalDateTime fim);
    List<Agendamento> findAllByOrderByDataHoraAsc();
}