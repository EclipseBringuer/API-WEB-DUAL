package com.gabimiguesamu.appWebDual.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "actividad")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_actividad")
    private Long id;

    @Column(name = "fecha")
    private Date date;

    @Column(name = "tipo_practica")
    private String practiceKind;

    @Column(name = "horas_realizadas")
    private Integer hoursDone;

    @Column(name = "actividad_realizada")
    private String name;

    @Column(name = "observaciones")
    private String observations;

    public Task(Long id, Date date, String practiceKind, Integer hoursDone, String name, String observations) {
        this.id = id;
        this.date = date;
        this.practiceKind = practiceKind;
        this.hoursDone = hoursDone;
        this.name = name;
        this.observations = observations;
    }

    public Task(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPracticeKind() {
        return practiceKind;
    }

    public void setPracticeKind(String practiceKind) {
        this.practiceKind = practiceKind;
    }

    public Integer getHoursDone() {
        return hoursDone;
    }

    public void setHoursDone(Integer hoursDone) {
        this.hoursDone = hoursDone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", date=" + date +
                ", practiceKind='" + practiceKind + '\'' +
                ", hoursDone=" + hoursDone +
                ", name='" + name + '\'' +
                ", observations='" + observations + '\'' +
                '}';
    }
}
