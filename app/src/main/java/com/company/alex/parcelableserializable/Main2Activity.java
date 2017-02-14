package com.company.alex.parcelableserializable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        Persona p = (Persona) i.getExtras().get("persona");

        PersonaParcelable pp = (PersonaParcelable) i.getExtras().get("personapp");

        //i.getParcelableExtra("persona"); //Así recogemos el objeto que hemos enviado
    }
}
