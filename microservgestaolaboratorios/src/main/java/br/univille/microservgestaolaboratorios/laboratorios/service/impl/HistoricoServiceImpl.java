package br.univille.microservgestaolaboratorios.laboratorios.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.univille.microservgestaolaboratorios.laboratorios.entity.Historico;
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
        @Override
        public Historico update(String id, Historico historico) {
           var buscaAntigo = repository.findById(id);
           if(buscaAntigo.isPresent()){
                var Antigo = buscaAntigo.get();
                Antigo.setControleAulas(historico.getControleAulas());
                Antigo.setDataFinal(historico.getDataFinal());
                Antigo.setDataInicio(historico.getDataInicio());
                Antigo.setDisciplina(historico.getDisciplina());
                Antigo.setGestaoCursosDisciplinas(historico.getGestaoCursosDisciplinas());
                Antigo.setLaboratorio(historico.getLaboratorio());
                Antigo.setNumeroAlunos(historico.getNumeroAlunos());
                Antigo.setProfessor(historico.getProfessor());
                repository.save(Antigo);
           }
           return null;
        }
    
    
        @Override
        public Historico delete(String id) {
            var buscaAntigo = repository.findById(id);
           if(buscaAntigo.isPresent()){
                var Antigo = buscaAntigo.get();
                repository.delete(Antigo);
                return Antigo;
           }
           return null;
        }
    }