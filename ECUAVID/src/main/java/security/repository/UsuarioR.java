package security.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import security.entity.usuario;

import java.util.Optional;

@Repository
public interface UsuarioR extends JpaRepository<usuario, Long> {
    Optional<usuario> findByNombreUsuario(String nu);
    boolean existsByNombreUsuario(String nu);
    boolean existsByEmail(String email);
}