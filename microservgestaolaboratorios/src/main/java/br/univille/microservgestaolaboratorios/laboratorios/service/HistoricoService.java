package br.univille.microservgestaolaboratorios.laboratorios.service;

import java.util.List;

import br.univille.microservgestaolaboratorios.laboratorios.entity.Agendamento;
import br.univille.microservgestaolaboratorios.laboratorios.entity.Historico;

public interface HistoricoService {
    List<Historico> getAll();
    Historico save(Historico historico);
    
}
