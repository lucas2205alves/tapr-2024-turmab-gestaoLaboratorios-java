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

import br.univille.microservgestaolaboratorios.laboratorios.entity.Manutencao;
import br.univille.microservgestaolaboratorios.laboratorios.service.ManutencaoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/v1/manutencao")
public class ManutencaoController {
    @Autowired
    private ManutencaoService service;

    @GetMapping
    public ResponseEntity<List<Manutencao>> get(){
        var listaManutencaos = service.getAll();

        return new ResponseEntity<List<Manutencao>>(listaManutencaos,HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Manutencao> post(@RequestBody Manutencao manutencao){
        if(manutencao == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var manutencaoSalvo = service.save(manutencao);

        return new ResponseEntity<Manutencao>(manutencaoSalvo, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Manutencao> put(@PathVariable("id") String id, @RequestBody Manutencao manutencao){
        if(manutencao == null | id == ""){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(manutencao == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Manutencao>(manutencao, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Manutencao> 
        delete(@PathVariable("id") String id){
        if(id == "" || id == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var manutencao = service.delete(id);
        if(manutencao != null){
            return new ResponseEntity<Manutencao>(manutencao, HttpStatus.OK);
        }
        return new ResponseEntity<Manutencao>(manutencao, HttpStatus.NOT_FOUND);
    }

}