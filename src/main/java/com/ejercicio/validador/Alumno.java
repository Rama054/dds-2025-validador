package com.ejercicio.validador;
import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String legajo;
    private List<Materia> materiasAprobadas = new ArrayList<>();

    public Alumno(String nombre, String legajo, List<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public boolean aproboMateria(Materia materia) {
        return materiasAprobadas.contains(materia);
    }
}
