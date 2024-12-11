package co.com.suscribete.dalelike.jhonsebastianas.models.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "USUARIO")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_USUARIO")
    private Long idUsuario;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "FECHA_NACIMIENTO")
    private Date fechaNacimiento;

    @Column(name = "IMAGEN_PERFIL")
    private Byte imagenPerfil;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

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
