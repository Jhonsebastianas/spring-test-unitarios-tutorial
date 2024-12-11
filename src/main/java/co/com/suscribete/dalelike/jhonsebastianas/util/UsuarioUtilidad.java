package co.com.suscribete.dalelike.jhonsebastianas.util;

import co.com.suscribete.dalelike.jhonsebastianas.repository.UsuarioRepository;

public class UsuarioUtilidad {

    private static UsuarioRepository usuarioRepository;

    public static void setUsuarioRepository(UsuarioRepository repository) {
        usuarioRepository = repository;
    }

    /**
     * Obtiene la cantidad de usuarios activos en el sistema
     *
     * @author <a href="https://www.jhonsebastianas.com/">Sebastian Agudelo</a></br>
     * @return
     */
    public static long obtenerCantidadUsuariosActivos() {
        if (usuarioRepository == null) {
            throw new IllegalStateException("UsuarioRepository no está inicializado");
        }
        return usuarioRepository.countByActivo(true);
    }
}
