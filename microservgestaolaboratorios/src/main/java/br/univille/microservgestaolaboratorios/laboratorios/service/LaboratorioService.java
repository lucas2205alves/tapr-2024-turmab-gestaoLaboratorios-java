package br.univille.microservgestaolaboratorios.laboratorios.service;

import java.util.List;


import br.univille.microservgestaolaboratorios.laboratorios.entity.Laboratorio;

public interface LaboratorioService {
    List<Laboratorio> getAll();
    Laboratorio save(Laboratorio laboratorio);
    

    Laboratorio update(String id, Laboratorio laboratorio);
    Laboratorio delete(String id);
}
