package co.com.suscribete.dalelike.jhonsebastianas.services.impl;

import co.com.suscribete.dalelike.jhonsebastianas.models.dto.UsuarioRegistrarInDTO;
import co.com.suscribete.dalelike.jhonsebastianas.models.entity.UsuarioEntity;
import co.com.suscribete.dalelike.jhonsebastianas.repository.UsuarioRepository;
import co.com.suscribete.dalelike.jhonsebastianas.services.UsuarioService;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Response registrarUsuario(UsuarioRegistrarInDTO usuarioRegistrarInDTO) {
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setFechaNacimiento(usuarioRegistrarInDTO.getFechaNacimiento());
        usuarioEntity.setNombre(usuarioRegistrarInDTO.getNombre());
        usuarioEntity.setImagenPerfil(usuarioRegistrarInDTO.getImagenPerfil());
        this.usuarioRepository.save(usuarioEntity);
        return Response.ok(usuarioEntity).build();
    }

    @Override
    public List<UsuarioEntity> obtenerTodosLosUsuarios() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public List<UsuarioEntity> obtenerUsuariosMayoriaEdad() {
        return this.usuarioRepository.findUsuariosMayoresOIguales(18);
    }

    @Override
    public List<UsuarioEntity> obtenerUsuariosMenoresEdad() {
        return this.usuarioRepository.findUsuariosMenores(18);
    }
}