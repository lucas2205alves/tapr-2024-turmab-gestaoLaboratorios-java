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
    }
