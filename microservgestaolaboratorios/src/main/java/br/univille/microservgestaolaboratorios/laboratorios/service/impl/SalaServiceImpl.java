package br.univille.microservgestaolaboratorios.laboratorios.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.univille.microservgestaolaboratorios.laboratorios.entity.Sala;
import br.univille.microservgestaolaboratorios.laboratorios.repository.SalaRepository;
import br.univille.microservgestaolaboratorios.laboratorios.service.SalaService;

public class SalaServiceImpl implements SalaService {
     
    @Autowired
    private SalaRepository repository;

    @Override
    public List<Sala> getAll() {
        var retorno = repository.findAll();
        List<Sala> listaSalas = new ArrayList<Sala>();
        retorno.forEach(listaSalas::add);

        return listaSalas;
    }

    @Override
    public Sala save(Sala sala) {
        return repository.save(sala);
    }
    @Override
    public Sala update(String id, Sala sala) {
       var buscaAntigo = repository.findById(id);
       if(buscaAntigo.isPresent()){
            var Antigo = buscaAntigo.get();
            Antigo.setSala(sala.getSala());
            repository.save(Antigo);
       }
       return null;
    }


    @Override
    public Sala delete(String id) {
        var buscaAntigo = repository.findById(id);
       if(buscaAntigo.isPresent()){
            var Antigo = buscaAntigo.get();
            repository.delete(Antigo);
            return Antigo;
       }
       return null;
    }
}