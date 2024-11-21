package br.univille.microservgestaolaboratorios.laboratorios.entity;

import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
public class Manutencao {
    @Id
    @GeneratedValue
    private String id;
    private Sala sala;
    private String descricao;
    private Boolean concluido;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
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