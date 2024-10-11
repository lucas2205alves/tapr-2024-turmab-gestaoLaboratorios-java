package br.univille.microservgestaolaboratorios.laboratorios.entity;

import java.util.UUID;
import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
@Container(containerName = "manutencao", autoCreateContainer = true)
public class Manutencao {
    @Id
    @PartitionKey
    @GeneratedValue
    private UUID id;
    private Sala sala;
    private String descricao;
    private Boolean concluido;
    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Boolean getConcluido() {
        return concluido;
    }
    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }

    
}