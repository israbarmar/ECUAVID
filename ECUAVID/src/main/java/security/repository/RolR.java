package security.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import security.entity.rol;
import security.enums.RolNombre;

import java.util.Optional;

@Repository
public interface RolR extends JpaRepository<rol, Long> {
    Optional<rol> findByRolNombre(RolNombre rolNombre);
}