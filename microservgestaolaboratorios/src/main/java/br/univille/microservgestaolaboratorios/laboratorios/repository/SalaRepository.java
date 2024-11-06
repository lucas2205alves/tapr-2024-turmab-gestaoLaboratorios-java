package br.univille.microservgestaolaboratorios.laboratorios.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import br.univille.microservgestaolaboratorios.laboratorios.entity.Sala;

public interface SalaRepository extends CrudRepository<Sala,UUID>{
    
}
