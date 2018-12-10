package com.fatec.maiara.ex;

import android.content.Intent;

public class Usuario {

    private String nome;
    private String email;
    private String senha;

    private Integer pontos;

    public Usuario(String nome, Integer pontos) {

        this.nome = nome;
        this.pontos = pontos;
    }


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

    public String getSenha() {
        return senha;
    }


    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public void setSenha(String s) {
    }
}
