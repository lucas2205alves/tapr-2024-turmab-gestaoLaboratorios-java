package br.univille.microservgestaolaboratorios.laboratorios.service;

import java.util.List;

import br.univille.microservgestaolaboratorios.laboratorios.entity.Manutencao;

public interface ManutencaoService {
    List<Manutencao> getAll();
    Manutencao save(Manutencao manutencao);
    
    
}
