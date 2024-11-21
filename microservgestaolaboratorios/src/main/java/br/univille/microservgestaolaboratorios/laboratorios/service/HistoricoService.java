package br.univille.microservgestaolaboratorios.laboratorios.service;

import java.util.List;


import br.univille.microservgestaolaboratorios.laboratorios.entity.Historico;

public interface HistoricoService {
    List<Historico> getAll();
    Historico save(Historico historico);
    Historico update(String id, Historico historico);
    Historico delete(String id);
}
