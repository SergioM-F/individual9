package cl.samf.individual9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListener();





    }



    private void initListener() {
        int imag1 = R.drawable.baseline_surfing_24;
        int imag2 = R.drawable.baseline_pets_24;
        int imag3 = R.drawable.baseline_sports_tennis_24;
        int imag4 = R.drawable.baseline_personal_injury_24;

        ImageButton imagen1 = findViewById(R.id.imagebutton1);
        ImageButton imagen2 = findViewById(R.id.imageButton2);
        ImageButton imagen3 = findViewById(R.id.imageButton3);
        ImageButton imagen4 = findViewById(R.id.imageButton4);
        Button botonSalir = findViewById(R.id.buttonSalir);

        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moverActivity2(imag1);
            }
        });

        imagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moverActivity2(imag2);
                }
            });

        imagen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moverActivity2(imag3);
            }
        });

        imagen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moverActivity2(imag4);
            }
        });

        botonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
    public void moverActivity2(int img) {
        Intent mover = new Intent(MainActivity.this, MainActivity2.class);
        mover.putExtra("clave",img);
        startActivity(mover);

    }
}