package br.univille.microservgestaolaboratorios.laboratorios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.NotFound;

import br.univille.microservgestaolaboratorios.laboratorios.entity.Laboratorio;
import br.univille.microservgestaolaboratorios.laboratorios.service.LaboratorioService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/v1/laboratorio")
public class LaboratorioController {
    @Autowired
    private LaboratorioService service;

    @GetMapping
    public ResponseEntity<List<Laboratorio>> get(){
        var listaLaboratorios = service.getAll();

        return new ResponseEntity<List<Laboratorio>>(listaLaboratorios,HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Laboratorio> post(@RequestBody Laboratorio laboratorio){
        if(laboratorio == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var laboratorioSalvo = service.save(laboratorio);

        return new ResponseEntity<Laboratorio>(laboratorioSalvo, HttpStatus.OK);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Laboratorio> put(@PathVariable("id") String id, @RequestBody Laboratorio laboratorio){
        if(laboratorio == null | id == ""){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(laboratorio == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Laboratorio>(laboratorio, HttpStatus.OK);
    }

}