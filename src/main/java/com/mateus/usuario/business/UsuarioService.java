package com.mateus.usuario.business;

import com.mateus.usuario.business.converter.UsuarioConverter;
import com.mateus.usuario.business.dto.UsuarioDTO;
import com.mateus.usuario.infrastructure.entity.Usuario;
import com.mateus.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvar(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }
}
