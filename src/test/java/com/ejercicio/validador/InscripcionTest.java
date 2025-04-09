import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import com.ejercicio.validador.Alumno;
import com.ejercicio.validador.Inscripcion;
import com.ejercicio.validador.Materia;


public class InscripcionTest {

    @Test
    public void testInscripcionAprobada() {
        Materia algoritmos = new Materia("Algoritmos", List.of());
        Materia discreta = new Materia("Discreta", List.of());
        Materia sistemasOrganizaciones = new Materia("Sistemas y Organizaciónes", List.of());

        Materia paradigmas = new Materia("Paradigmas", List.of(algoritmos, discreta));
        Materia analisisDeSistemas = new Materia("Análisis de Sistemas", List.of(sistemasOrganizaciones, algoritmos));

        Materia diseño = new Materia("Diseño", List.of(paradigmas, analisisDeSistemas));

        Alumno juancito = new Alumno("Juan", "123456", List.of(algoritmos, discreta, sistemasOrganizaciones, paradigmas, analisisDeSistemas));
        
        Inscripcion inscripcion = new Inscripcion(juancito, List.of(diseño));
        assertTrue(inscripcion.aprobada());
    }

    @Test
    public void testInscripcionNoAprobada() {
        Materia algoritmos = new Materia("Algoritmos", List.of());
        Materia discreta = new Materia("Discreta", List.of());
        Materia sistemasOrganizaciones = new Materia("Sistemas y Organizaciónes", List.of());

        Materia paradigmas = new Materia("Paradigmas", List.of(algoritmos, discreta));
        Materia analisisDeSistemas = new Materia("Análisis de Sistemas", List.of(sistemasOrganizaciones, algoritmos));

        Materia diseño = new Materia("Diseño", List.of(paradigmas, analisisDeSistemas));

        Alumno juancito = new Alumno("Juan", "123456", List.of(algoritmos, discreta, sistemasOrganizaciones, paradigmas));
        
        Inscripcion inscripcion = new Inscripcion(juancito, List.of(diseño));
        assertFalse(inscripcion.aprobada());
    }

    
}
