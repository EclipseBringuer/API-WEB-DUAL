package com.gabimiguesamu.appWebDual.model;


import jakarta.persistence.*;

@Entity
@Table(name="empresa")
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "telefono")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "responsable")
    private String responsable;

    @Column(name = "observaciones")
    private String observations;

    @Column(name = "ubicacion")
    private String ubication;

    @Column(name = "logo")
    private String logo;

    public Enterprise(Long id, String name, String phone, String email, String responsable, String observations, String ubication, String logo) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.responsable = responsable;
        this.observations = observations;
        this.ubication = ubication;
        this.logo = logo;
    }

    public Enterprise(){

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", responsable='" + responsable + '\'' +
                ", observations='" + observations + '\'' +
                ", ubication='" + ubication + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
