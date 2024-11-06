package br.univille.microservgestaolaboratorios.laboratorios.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.univille.microservgestaolaboratorios.laboratorios.entity.Manutencao;
import br.univille.microservgestaolaboratorios.laboratorios.repository.ManutencaoRepository;
import br.univille.microservgestaolaboratorios.laboratorios.service.ManutencaoService;

public class ManutencaoServiceImpl implements ManutencaoService{
    
    @Autowired
    private ManutencaoRepository repository;

    @Override
    public List<Manutencao> getAll() {
        var retorno = repository.findAll();
        List<Manutencao> listaManutencaos = new ArrayList<Manutencao>();
        retorno.forEach(listaManutencaos::add);

        return listaManutencaos;
    }

    @Override
    public Manutencao save(Manutencao manutencao) {
        return repository.save(manutencao);
    }
}