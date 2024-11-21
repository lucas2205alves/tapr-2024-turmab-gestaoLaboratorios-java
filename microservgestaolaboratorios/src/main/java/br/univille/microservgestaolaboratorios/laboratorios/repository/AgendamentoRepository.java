package br.univille.microservgestaolaboratorios.laboratorios.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservgestaolaboratorios.laboratorios.entity.Agendamento;

@Repository
public interface AgendamentoRepository extends CrudRepository<Agendamento,String>{
    
}
