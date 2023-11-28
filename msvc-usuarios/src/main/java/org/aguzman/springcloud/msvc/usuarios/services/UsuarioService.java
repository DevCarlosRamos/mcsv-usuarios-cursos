package org.aguzman.springcloud.msvc.usuarios.services;

import org.aguzman.springcloud.msvc.usuarios.models.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> listar();
    Optional<Usuario> porId(String id);
    Usuario guardar(Usuario usuario);
    void eliminar(String id);
    List<Usuario> listarPorIds(Iterable<String> ids);

    Optional<Usuario> porEmail(String email);
    boolean existePorEmail(String email);
    boolean existePorNombre(String nombre);
}
