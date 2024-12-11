package co.com.suscribete.dalelike.jhonsebastianas.repository;

import co.com.suscribete.dalelike.jhonsebastianas.models.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    /**
     * Usuarios cuya edad es mayor o igual a un valor dado
     *
     * @author <a href="https://www.jhonsebastianas.com/">Sebastian Agudelo</a></br>
     * @param edad
     * @return
     */
    @Query("SELECT u FROM UsuarioEntity u WHERE YEAR(CURRENT_DATE) - YEAR(u.fechaNacimiento) - " +
            "(CASE WHEN MONTH(CURRENT_DATE) < MONTH(u.fechaNacimiento) OR " +
            "(MONTH(CURRENT_DATE) = MONTH(u.fechaNacimiento) AND DAY(CURRENT_DATE) < DAY(u.fechaNacimiento)) " +
            "THEN 1 ELSE 0 END) >= :edad")
    List<UsuarioEntity> findUsuariosMayoresOIguales(@Param("edad") int edad);

    /**
     * Usuarios cuya edad es menor a un valor dado
     *
     * @author <a href="https://www.jhonsebastianas.com/">Sebastian Agudelo</a></br>
     * @param edad
     * @return
     */
    @Query("SELECT u FROM UsuarioEntity u WHERE YEAR(CURRENT_DATE) - YEAR(u.fechaNacimiento) - " +
            "(CASE WHEN MONTH(CURRENT_DATE) < MONTH(u.fechaNacimiento) OR " +
            "(MONTH(CURRENT_DATE) = MONTH(u.fechaNacimiento) AND DAY(CURRENT_DATE) < DAY(u.fechaNacimiento)) " +
            "THEN 1 ELSE 0 END) < :edad")
    List<UsuarioEntity> findUsuariosMenores(@Param("edad") int edad);

    /**
     *
     *
     * @author <a href="https://www.jhonsebastianas.com/">Sebastian Agudelo</a></br>
     * @param activo
     * @return
     */
    long countByActivo(boolean activo);
}