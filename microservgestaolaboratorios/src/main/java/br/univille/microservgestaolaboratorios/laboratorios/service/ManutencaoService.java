package br.univille.microservgestaolaboratorios.laboratorios.service;

import java.util.List;


import br.univille.microservgestaolaboratorios.laboratorios.entity.Manutencao;

public interface ManutencaoService {
    List<Manutencao> getAll();
    Manutencao save(Manutencao manutencao);
    
    Manutencao update(String id, Manutencao manutencao);
    Manutencao delete(String id);
}
