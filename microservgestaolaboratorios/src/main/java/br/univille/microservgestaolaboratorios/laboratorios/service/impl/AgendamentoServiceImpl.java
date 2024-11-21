package br.univille.microservgestaolaboratorios.laboratorios.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservgestaolaboratorios.laboratorios.entity.Agendamento;
import br.univille.microservgestaolaboratorios.laboratorios.repository.AgendamentoRepository;
import br.univille.microservgestaolaboratorios.laboratorios.service.AgendamentoService;

@Service
public class AgendamentoServiceImpl implements AgendamentoService{

        @Autowired
        private AgendamentoRepository repository;
    
        @Override
        public List<Agendamento> getAll() {
            var retorno = repository.findAll();
            List<Agendamento> listaAgendamentos = new ArrayList<Agendamento>();
            retorno.forEach(listaAgendamentos::add);
    
            return listaAgendamentos;
        }
    
        @Override
        public Agendamento save(Agendamento agendamento) {
            return repository.save(agendamento);
        }
        @Override
        public Agendamento update(String id, Agendamento agendamento) {
           var buscaAntigo = repository.findById(id);
           if(buscaAntigo.isPresent()){
                var Antigo = buscaAntigo.get();
                Antigo.setControleAulas(agendamento.getControleAulas());
                Antigo.setDataFinal(agendamento.getDataFinal());
                Antigo.setDataInicio(agendamento.getDataInicio());
                Antigo.setDisciplina(agendamento.getDisciplina());
                Antigo.setGestaoCursosDisciplinas(agendamento.getGestaoCursosDisciplinas());
                Antigo.setLaboratorio(agendamento.getLaboratorio());
                Antigo.setHorarioFinal(agendamento.getHorarioFinal());
                Antigo.setHorarioInicio(agendamento.getHorarioInicio());
                Antigo.setLaboratorio(agendamento.getLaboratorio());
                Antigo.setNumeroAlunos(agendamento.getNumeroAlunos());
                Antigo.setProfessor(agendamento.getProfessor());
                repository.save(Antigo);
           }
           return null;
        }
    
    
        @Override
        public Agendamento delete(String id) {
            var buscaAntigo = repository.findById(id);
           if(buscaAntigo.isPresent()){
                var Antigo = buscaAntigo.get();
                repository.delete(Antigo);
                return Antigo;
           }
           return null;
        }
    }
