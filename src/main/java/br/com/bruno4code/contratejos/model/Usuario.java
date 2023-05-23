package br.com.bruno4code.contratejos.model;

import br.com.bruno4code.contratejos.model.enums.TipoUsuarioEnum;

public abstract class Usuario {

    private String nome;
    private String email;
    private TipoUsuarioEnum tipoUsuarioEnum;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoUsuarioEnum getTipoUsuarioEnum() {
        return tipoUsuarioEnum;
    }

    public void setTipoUsuarioEnum(TipoUsuarioEnum tipoUsuarioEnum) {
        this.tipoUsuarioEnum = tipoUsuarioEnum;
    }
}
