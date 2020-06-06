package com.projeto.pi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.projeto.pi.Model.Denuncia;

import java.util.HashMap;

public class HelperActivity extends AppCompatActivity {
    private Spinner spnAgressao;
    private EditText edtDenuncia;
    private Button btnEnviar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_notification);

        inicializarComp();

    btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void inicializarComp(){

        edtDenuncia = findViewById(R.id.edtDenuncia);
        btnEnviar   = findViewById(R.id.btnEnviar);
        spnAgressao = findViewById(R.id.spnAgressao);
    }

}
