package br.univille.microservgestaolaboratorios.laboratorios.entity;

import java.util.UUID;

public class Laboratorio {
    private UUID id;
    private Sala sala;
    private int capacidade;
    private Boolean laboratorio;
    private Manutencao manutencao;
    
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