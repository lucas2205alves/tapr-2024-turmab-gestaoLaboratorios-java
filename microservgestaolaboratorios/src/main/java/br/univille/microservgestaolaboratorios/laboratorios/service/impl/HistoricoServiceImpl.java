package br.univille.microservgestaolaboratorios.laboratorios.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservgestaolaboratorios.laboratorios.entity.Agendamento;
import br.univille.microservgestaolaboratorios.laboratorios.entity.Historico;
import br.univille.microservgestaolaboratorios.laboratorios.repository.AgendamentoRepository;
import br.univille.microservgestaolaboratorios.laboratorios.repository.HistoricoRepository;
import br.univille.microservgestaolaboratorios.laboratorios.service.HistoricoService;

@Service
public class HistoricoServiceImpl implements HistoricoService{
    
        @Autowired
        private HistoricoRepository repository;
    
        @Override
        public List<Historico> getAll() {
            var retorno = repository.findAll();
            List<Historico> listaHistoricos = new ArrayList<Historico>();
            retorno.forEach(listaHistoricos::add);
    
            return listaHistoricos;
        }
    
        @Override
        public Historico save(Historico historico) {
            return repository.save(historico);
        }
    }

