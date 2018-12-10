package com.fatec.maiara.ex;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class FormularioHelper {
    private EditText campoNome;
    private EditText campoEmail;
    private EditText campoSenha;
    private Button btn;

    private Usuario usuario;

    public void FormularioCadastro(EditText campoNome, EditText campoEmail, EditText campoSenha) {
        this.campoNome = campoNome;
        this.campoEmail = campoEmail;
        this.campoSenha = campoSenha;

    }

    public Usuario novoUsuario(){

        usuario.setNome(campoNome.getText().toString());
        usuario.setEmail(campoEmail.getText().toString());
        usuario.setSenha(campoSenha.getText().toString());

        usuario = new Usuario(campoNome.getText().toString(), 0);
        return usuario;
    }


}
