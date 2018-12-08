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
        List<String> spinner  = new ArrayList<>();
        spinner.add("Professor");
        spinner.add("Aluno");
        Spinner campoTipo;
        campoTipo = (Spinner)findViewById(R.id.tipo_conta);


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinner);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        campoTipo.setAdapter(dataAdapter);

        campoTipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.FormularioCadastro(campoNome, campoEmail, campoSenha);
                helper.novoUsuario();
                Toast.makeText(CadastroActivity.this, " Obrigad apor cadastrar " + campoNome.getText() + " !", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}