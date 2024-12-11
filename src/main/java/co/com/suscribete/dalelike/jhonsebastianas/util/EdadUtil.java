package co.com.suscribete.dalelike.jhonsebastianas.util;

import java.time.LocalDate;
import java.time.Period;

public class EdadUtil {

    /**
     * Calcula la edad a partir de la fecha de nacimiento.
     *
     * @author <a href="https://www.jhonsebastianas.com/">Sebastian Agudelo</a></br>
     * @param fechaNacimiento La fecha de nacimiento (LocalDate).
     * @return La edad calculada (int).
     */
    public static int calcularEdad(LocalDate fechaNacimiento) {
        if (fechaNacimiento == null) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula");
        }
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }
}
