package com.company.alex.parcelableserializable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Persona p = new Persona("Fausto", 55);

        Intent i2 = new Intent(this, Main2Activity.class);
        i2.putExtra("persona", p);
        startActivity(i2);
    }
}
