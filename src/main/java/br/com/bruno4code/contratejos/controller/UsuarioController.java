package br.com.bruno4code.contratejos.controller;

import br.com.bruno4code.contratejos.model.Dev;
import br.com.bruno4code.contratejos.model.Usuario;
import br.com.bruno4code.contratejos.model.enums.TipoUsuarioEnum;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @PostMapping
    public ResponseEntity<Usuario> cadastro(@RequestBody Usuario usuario) {

        if(usuario.getTipoUsuarioEnum().equals(TipoUsuarioEnum.DEV)) {
            Usuario usuarioDev = new Dev();
            usuarioDev.setTipoUsuarioEnum(TipoUsuarioEnum.DEV);
            // chama repo de cadastro
            return ResponseEntity.ok().body(usuarioDev);
        }
        // tratar
        return ResponseEntity.ok().body(null);
    }

}
