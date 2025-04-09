package com.ejercicio.validador;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }

    public boolean aprobada() {
        for (Materia materia : materias) {
            for (Materia correlativa : materia.getCorrelativas()) {
                if (!alumno.aproboMateria(correlativa)) {
                    return false;
                }
            }
        }
        return true;
    }
}
