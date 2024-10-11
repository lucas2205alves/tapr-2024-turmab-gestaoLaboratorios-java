package br.univille.microservgestaolaboratorios.laboratorios.entity;

import java.util.Date;
import java.util.UUID;
import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
@Container(containerName = "historico", autoCreateContainer = true)
public class Historico {
    @Id
    @PartitionKey
    @GeneratedValue
    private UUID id;
    private UUID laboratorio;
    private Date dataInicio;
    private Date dataFinal;
    private Date horarioInicio;
    private Date horarioFinal;
    private int numeroAlunos;
    private String professor;
    private String disciplina;
    private UUID ControleAulas;
    private UUID GestaoCursosDisciplinas;
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public UUID getLaboratorio() {
        return laboratorio;
    }
    public void setLaboratorio(UUID laboratorio) {
        this.laboratorio = laboratorio;
    }
    public Date getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    public Date getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
    public Date getHorarioInicio() {
        return horarioInicio;
    }
    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }
    public Date getHorarioFinal() {
        return horarioFinal;
    }
    public void setHorarioFinal(Date horarioFinal) {
        this.horarioFinal = horarioFinal;
    }
    public int getNumeroAlunos() {
        return numeroAlunos;
    }
    public void setNumeroAlunos(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
    }
    public String getProfessor() {
        return professor;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public UUID getControleAulas() {
        return ControleAulas;
    }
    public void setControleAulas(UUID controleAulas) {
        ControleAulas = controleAulas;
    }
    public UUID getGestaoCursosDisciplinas() {
        return GestaoCursosDisciplinas;
    }
    public void setGestaoCursosDisciplinas(UUID gestaoCursosDisciplinas) {
        GestaoCursosDisciplinas = gestaoCursosDisciplinas;
    }
    

}