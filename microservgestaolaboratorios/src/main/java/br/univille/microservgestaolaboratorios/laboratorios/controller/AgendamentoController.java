package br.univille.microservgestaolaboratorios.laboratorios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservgestaolaboratorios.laboratorios.entity.Agendamento;
import br.univille.microservgestaolaboratorios.laboratorios.service.AgendamentoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/v1/agendamentos")
public class AgendamentoController {
    @Autowired
    private AgendamentoService service;

    @GetMapping
    public ResponseEntity<List<Agendamento>> get(){
        var listaAgendamentos = service.getAll();

        return new ResponseEntity<List<Agendamento>>(listaAgendamentos,HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Agendamento> post(@RequestBody Agendamento agendamento){
        if(agendamento == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var agendamentoSalvo = service.save(agendamento);

        return new ResponseEntity<Agendamento>(agendamentoSalvo, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Agendamento> put(@PathVariable("id") String id, @RequestBody Agendamento agendamento){
        if(agendamento == null | id == ""){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(agendamento == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Agendamento>(agendamento, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Agendamento> 
        delete(@PathVariable("id") String id){
        if(id == "" || id == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var agendamento = service.delete(id);
        if(agendamento != null){
            return new ResponseEntity<Agendamento>(agendamento, HttpStatus.OK);
        }
        return new ResponseEntity<Agendamento>(agendamento, HttpStatus.NOT_FOUND);
    }

}