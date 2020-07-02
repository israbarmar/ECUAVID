package security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import security.entity.usuario;
import security.repository.UsuarioR;

import java.util.Optional;

@Service
@Transactional
public class UsuarioS {

    @Autowired
    UsuarioR usuarioRepository;

    public Optional<usuario> getByNombreUsuario(String nu){
        return usuarioRepository.findByNombreUsuario(nu);
    }

    public boolean existePorNombre(String nu){
        return usuarioRepository.existsByNombreUsuario(nu);
    }

    public  boolean existePorEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }

    public void guardar(usuario usuario){
        usuarioRepository.save(usuario);
    }
}