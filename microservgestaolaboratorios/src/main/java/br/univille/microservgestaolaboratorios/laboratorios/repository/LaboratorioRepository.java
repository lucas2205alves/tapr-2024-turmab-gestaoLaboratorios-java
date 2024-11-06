package br.univille.microservgestaolaboratorios.laboratorios.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservgestaolaboratorios.laboratorios.entity.Laboratorio;

@Repository
public interface LaboratorioRepository extends CrudRepository<Laboratorio,UUID>{
    
}
