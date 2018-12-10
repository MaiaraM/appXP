package com.fatec.maiara.ex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CadastroActivity extends AppCompatActivity  {

    @BindView(R.id.cadastro_nome)
    EditText campoNome;
    @BindView(R.id.cadastro_email)
    EditText campoEmail;
    @BindView(R.id.cadastro_senha)
    EditText campoSenha;
    @BindView(R.id.cadastro_btn_salvar)
    Button btnSalvar;

    private Usuario usuario;
    private FormularioHelper helper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        ButterKnife.bind(this);

        helper = new FormularioHelper();


        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.FormularioCadastro(campoNome, campoEmail, campoSenha);
                helper.novoUsuario();
                Toast.makeText(CadastroActivity.this, " Obrigada por cadastrar " + campoNome.getText() + " !", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}