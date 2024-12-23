package br.univille.microservgestaolaboratorios.laboratorios.service;

import java.util.List;


import br.univille.microservgestaolaboratorios.laboratorios.entity.Sala;

public interface SalaService {
    List<Sala> getAll();
    Sala save(Sala sala);
    Sala update(String id, Sala sala);
    Sala delete(String id);
}
