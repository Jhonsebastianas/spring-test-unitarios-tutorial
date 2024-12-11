package co.com.suscribete.dalelike.jhonsebastianas.util;

import java.time.LocalDate;
import java.time.Period;

public class UtilidadFecha {

    /**
     * Calcula la diferencia de dos fechas en años
     *
     * @author <a href="https://www.jhonsebastianas.com/">Sebastian Agudelo</a></br>
     * @param fechaInicio
     * @param fechaFin
     * @return
     */
    public static int calcularDiferenciaAnios(LocalDate fechaInicio, LocalDate fechaFin) {
        if (fechaInicio == null || fechaFin == null) {
            throw new IllegalArgumentException("Las fechas no pueden ser nulas");
        }
        return Period.between(fechaInicio, fechaFin).getYears();
    }

}
