package com.gabimiguesamu.appWebDual.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "alumno")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre")
    private String name;

    @Column(name="apellidos")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="pass")
    private String password;

    @Column(name="fecha_nac")
    private Date bornDate;

    @Column(name="telefono")
    private String phone;

    @Column(name = "num_horas_dual")
    private Integer dualHours;

    @Column(name="num_horas_fct")
    private Integer fctHours;

    @Column(name = "observaciones")
    private String observations;

    @ManyToOne
    @JoinColumn(name="id_tutor")
    private Teacher teacher;

    @OneToMany
    @JoinColumn(name="id_alumno")
    private List<Task> taskList;

    @ManyToOne
    @JoinColumn(name="id_empresa")
    private Enterprise enterprise;


    public Student(Long id, String name, String lastName, String email, String password, Date bornDate, String phone, Integer dualHours, Integer fctHours, String observations, Teacher teacher, List<Task> taskList, Enterprise enterprise) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.bornDate = bornDate;
        this.phone = phone;
        this.dualHours = dualHours;
        this.fctHours = fctHours;
        this.observations = observations;
        this.teacher = teacher;
        this.taskList = taskList;
        this.enterprise = enterprise;
    }

    public Student(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getDualHours() {
        return dualHours;
    }

    public void setDualHours(Integer dualHours) {
        this.dualHours = dualHours;
    }

    public Integer getFctHours() {
        return fctHours;
    }

    public void setFctHours(Integer fctHours) {
        this.fctHours = fctHours;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    @Override
    public String toString() {
        return "Student{" +
                "dni='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", bornDate=" + bornDate +
                ", phone='" + phone + '\'' +
                ", dualHours=" + dualHours +
                ", fctHours=" + fctHours +
                ", observations='" + observations + '\'' +
                ", teacher=" + teacher +
                ", taskList=" + taskList +
                ", enterprise=" + enterprise +
                '}';
    }
}
