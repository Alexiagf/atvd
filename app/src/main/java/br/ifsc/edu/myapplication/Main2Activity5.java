package br.ifsc.edu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity5 extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);
        imageView = findViewById(R.id.imageView);
    }

    public void mudaTexto(View view) {
        imageView.setImageResource(R.drawable.cachorro);

    }
}
