package br.univille.microservgestaolaboratorios.laboratorios.entity;

import java.util.UUID;
import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
@Container(containerName = "laboratorio", autoCreateContainer = true)
public class Laboratorio {
    @Id
    @PartitionKey
    @GeneratedValue
    private String id;
    private Sala sala;
    private int capacidade;
    private Boolean laboratorio;
    private Manutencao manutencao;
    
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
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public Boolean getLaboratorio() {
        return laboratorio;
    }
    public void setLaboratorio(Boolean laboratorio) {
        this.laboratorio = laboratorio;
    }
    public Manutencao getManutencao() {
        return manutencao;
    }
    public void setManutencao(Manutencao manutencao) {
        this.manutencao = manutencao;
    }

    

}