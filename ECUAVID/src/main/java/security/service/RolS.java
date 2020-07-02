package security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import security.entity.rol;
import security.enums.RolNombre;
import security.repository.RolR;

import java.util.Optional;

@Service
@Transactional
public class RolS {

    @Autowired
    RolR rolRepository;

    public Optional<rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }
}