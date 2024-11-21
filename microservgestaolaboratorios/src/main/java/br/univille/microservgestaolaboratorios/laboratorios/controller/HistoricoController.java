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

import br.univille.microservgestaolaboratorios.laboratorios.entity.Historico;
import br.univille.microservgestaolaboratorios.laboratorios.service.HistoricoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/v1/historico")
public class HistoricoController {
    @Autowired
    private HistoricoService service;

    @GetMapping
    public ResponseEntity<List<Historico>> get(){
        var listaHistoricos = service.getAll();

        return new ResponseEntity<List<Historico>>(listaHistoricos,HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Historico> post(@RequestBody Historico historico){
        if(historico == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var historicoSalvo = service.save(historico);

        return new ResponseEntity<Historico>(historicoSalvo, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Historico> put(@PathVariable("id") String id, @RequestBody Historico historico){
        if(historico == null | id == ""){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(historico == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Historico>(historico, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Historico> 
        delete(@PathVariable("id") String id){
        if(id == "" || id == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var historico = service.delete(id);
        if(historico != null){
            return new ResponseEntity<Historico>(historico, HttpStatus.OK);
        }
        return new ResponseEntity<Historico>(historico, HttpStatus.NOT_FOUND);
    }

}