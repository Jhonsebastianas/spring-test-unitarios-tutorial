package co.com.suscribete.dalelike.jhonsebastianas.models.dto;
import java.util.Date;

public class UsuarioRegistrarInDTO {
    private String nombre;
    private Date fechaNacimiento;
    private Byte imagenPerfil;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Byte getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(Byte imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }
}
