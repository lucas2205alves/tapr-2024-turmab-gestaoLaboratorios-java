package br.univille.microservgestaolaboratorios.laboratorios.service;

import java.util.List;

import br.univille.microservgestaolaboratorios.laboratorios.entity.Agendamento;


public interface AgendamentoService {
    List<Agendamento> getAll();
    Agendamento save(Agendamento agendamento);

    Agendamento update(String id, Agendamento agendamento);
    Agendamento delete(String id);
    
}
