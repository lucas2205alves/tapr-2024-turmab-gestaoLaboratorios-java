package br.univille.microservgestaolaboratorios.laboratorios.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.univille.microservgestaolaboratorios.laboratorios.entity.Laboratorio;
import br.univille.microservgestaolaboratorios.laboratorios.repository.LaboratorioRepository;
import br.univille.microservgestaolaboratorios.laboratorios.service.LaboratorioService;

public class LaboratorioServiceImpl implements LaboratorioService{
    
    @Autowired
    private LaboratorioRepository repository;

    @Override
    public List<Laboratorio> getAll() {
        var retorno = repository.findAll();
        List<Laboratorio> listaLaboratorios = new ArrayList<Laboratorio>();
        retorno.forEach(listaLaboratorios::add);

        return listaLaboratorios;
    }

    @Override
    public Laboratorio save(Laboratorio laboratorio) {
        return repository.save(laboratorio);
    }

    @Override
    public Laboratorio update(String id, Laboratorio laboratorio) {
       var buscaLaboratorioAntigo = repository.findById(id);
       if(buscaLaboratorioAntigo.isPresent()){
            var laboratorioAntigo = buscaLaboratorioAntigo.get();
            laboratorioAntigo.setCapacidade(laboratorio.getCapacidade());
            laboratorioAntigo.setLaboratorio(laboratorio.getLaboratorio());
            laboratorioAntigo.setManutencao(laboratorio.getManutencao());
            laboratorioAntigo.setSala(laboratorio.getSala());
            repository.save(laboratorioAntigo);
       }
       return null;
    }


    @Override
    public Laboratorio delete(String id) {
        var buscaLaboratorioAntigo = repository.findById(id);
       if(buscaLaboratorioAntigo.isPresent()){
            var laboratorioAntigo = buscaLaboratorioAntigo.get();
            repository.delete(laboratorioAntigo);
            return laboratorioAntigo;
       }
       return null;
    }
}
