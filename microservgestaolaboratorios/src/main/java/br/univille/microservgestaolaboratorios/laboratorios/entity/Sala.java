package br.univille.microservgestaolaboratorios.laboratorios.entity;

import com.azure.spring.data.cosmos.core.mapping.Container;

@Container(containerName = "sala", autoCreateContainer = true)
public class Sala {
    private String sala;

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
    
}