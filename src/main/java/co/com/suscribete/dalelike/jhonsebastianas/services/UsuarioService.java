package co.com.suscribete.dalelike.jhonsebastianas.services;

import co.com.suscribete.dalelike.jhonsebastianas.models.dto.UsuarioRegistrarInDTO;
import co.com.suscribete.dalelike.jhonsebastianas.models.entity.UsuarioEntity;
import jakarta.ws.rs.core.Response;

import java.util.List;

public interface UsuarioService {

    /**
     * Método encargado de registrar un usuario nuevo en el sistema.
     *
     * @author <a href="https://www.jhonsebastianas.com/">Sebastian Agudelo</a></br>
     * @param usuarioRegistrarInDTO usuario a registrar en el sistema
     * @return
     */
    Response registrarUsuario(UsuarioRegistrarInDTO usuarioRegistrarInDTO);

    /**
     * Método encargado de obtener toda la lista de usuarios
     *
     * @author <a href="https://www.jhonsebastianas.com/">Sebastian Agudelo</a></br>
     * @return
     */
    List<UsuarioEntity> obtenerTodosLosUsuarios();

    /**
     * Método que obtiene todos los usuarios mayores de edad en el sistema
     *
     * @author <a href="https://www.jhonsebastianas.com/">Sebastian Agudelo</a></br>
     * @return
     */
    List<UsuarioEntity> obtenerUsuariosMayoriaEdad();

    /**
     * Método encargado de obtener los usuarios menores de edad
     *
     * @author <a href="https://www.jhonsebastianas.com/">Sebastian Agudelo</a></br>
     * @return
     */
    List<UsuarioEntity> obtenerUsuariosMenoresEdad();

}
