package com.projeto.pi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.auth.FirebaseAuth;
import com.projeto.pi.Model.Denuncia;

public class HelperActivity extends AppCompatActivity {
    Spinner spnAgressao;
    EditText edtDenuncia;
    Button btnEnviar;
    Fragment selectedfragment = null;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_helper);

        inicializarComp();


        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void test(){

    }
    void inicializarComp(){

        edtDenuncia = findViewById(R.id.edtDenuncia);
        btnEnviar   = findViewById(R.id.btnEnviar);
        spnAgressao = findViewById(R.id.spnAgressao);
    }

}
