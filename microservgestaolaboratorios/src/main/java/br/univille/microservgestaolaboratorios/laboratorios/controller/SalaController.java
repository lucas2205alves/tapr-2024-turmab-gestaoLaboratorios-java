package br.univille.microservgestaolaboratorios.laboratorios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservgestaolaboratorios.laboratorios.entity.Sala;
import br.univille.microservgestaolaboratorios.laboratorios.service.SalaService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/v1/sala")
public class SalaController {
    @Autowired
    private SalaService service;

    @GetMapping
    public ResponseEntity<List<Sala>> get(){
        var listaSalas = service.getAll();

        return new ResponseEntity<List<Sala>>(listaSalas,HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Sala> post(@RequestBody Sala sala){
        if(sala == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var salaSalvo = service.save(sala);

        return new ResponseEntity<Sala>(salaSalvo, HttpStatus.OK);
    }
}