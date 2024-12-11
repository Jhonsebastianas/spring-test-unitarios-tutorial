package co.com.suscribete.dalelike.jhonsebastianas.controllers;

import co.com.suscribete.dalelike.jhonsebastianas.models.dto.UsuarioRegistrarInDTO;
import co.com.suscribete.dalelike.jhonsebastianas.models.entity.UsuarioEntity;
import co.com.suscribete.dalelike.jhonsebastianas.services.UsuarioService;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    /**
     * Endpoint para registrar un nuevo usuario.
     *
     * @author <a href="https://www.jhonsebastianas.com/">Sebastian Agudelo</a></br>
     * @param usuarioRegistrarInDTO Datos del usuario a registrar.
     * @return El usuario registrado.
     */
    @PostMapping("/registrar")
    public ResponseEntity<UsuarioEntity> registrarUsuario(@RequestBody UsuarioRegistrarInDTO usuarioRegistrarInDTO) {
        Response response = usuarioService.registrarUsuario(usuarioRegistrarInDTO);
        return ResponseEntity.status(response.getStatus()).body((UsuarioEntity) response.getEntity());
    }

    /**
     * Endpoint para obtener todos los usuarios.
     *
     * @author <a href="https://www.jhonsebastianas.com/">Sebastian Agudelo</a></br>
     * @return Lista de todos los usuarios.
     */
    @GetMapping("/todos")
    public ResponseEntity<List<UsuarioEntity>> obtenerTodosLosUsuarios() {
        List<UsuarioEntity> usuarios = usuarioService.obtenerTodosLosUsuarios();
        return ResponseEntity.ok(usuarios);
    }

    /**
     * Endpoint para obtener usuarios mayores de edad.
     *
     * @author <a href="https://www.jhonsebastianas.com/">Sebastian Agudelo</a></br>
     * @return Lista de usuarios cuya edad es mayor o igual a 18 años.
     */
    @GetMapping("/mayores-edad")
    public ResponseEntity<List<UsuarioEntity>> obtenerUsuariosMayoriaEdad() {
        List<UsuarioEntity> usuarios = usuarioService.obtenerUsuariosMayoriaEdad();
        return ResponseEntity.ok(usuarios);
    }

    /**
     * Endpoint para obtener usuarios menores de edad.
     *
     * @author <a href="https://www.jhonsebastianas.com/">Sebastian Agudelo</a></br>
     * @return Lista de usuarios cuya edad es menor a 18 años.
     */
    @GetMapping("/menores-edad")
    public ResponseEntity<List<UsuarioEntity>> obtenerUsuariosMenoresEdad() {
        List<UsuarioEntity> usuarios = usuarioService.obtenerUsuariosMenoresEdad();
        return ResponseEntity.ok(usuarios);
    }
}
