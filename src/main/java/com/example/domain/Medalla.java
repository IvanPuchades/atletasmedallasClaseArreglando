package com.example.domain;

import javax.persistence.*;

/**
 * Created by dam on 1/12/16.
 */


@Entity
public class Medalla {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Enumerated(EnumType.STRING)
    private TipoMedalla tipoMedalla;
    private String especialidad;
    private String competicion;

    //Constructor vacio
    public Medalla() {
    }

    //Constructor
    public Medalla(TipoMedalla tipoMedalla, int enumeracion, String especialidad, String competicion) {
        this.tipoMedalla = tipoMedalla;
        this.especialidad = especialidad;
        this.competicion = competicion;

    }
    //Getters
    public long getId() {
        return id;
    }

    public TipoMedalla getTipoMedalla() {return tipoMedalla; }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getCompeticion() {
        return competicion;
    }



    //Setters

    public void setId(long id) {
        this.id = id;
    }

    public void setTipoMedalla(TipoMedalla tipoMedalla) {this.tipoMedalla = tipoMedalla; }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    @Override
    public String toString() {
        return "Medalla{" +
                "id=" + id +
                ", tipoMedalla="+ tipoMedalla +
                ", especialidad='" + especialidad + '\'' +
                ", competicion='" + competicion + '\'' +
                '}';
    }
}
