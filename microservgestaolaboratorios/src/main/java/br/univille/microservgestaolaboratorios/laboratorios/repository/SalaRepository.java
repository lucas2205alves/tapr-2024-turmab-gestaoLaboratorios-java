package br.univille.microservgestaolaboratorios.laboratorios.repository;


import org.springframework.data.repository.CrudRepository;

import br.univille.microservgestaolaboratorios.laboratorios.entity.Sala;

public interface SalaRepository extends CrudRepository<Sala,String>{
    
}
