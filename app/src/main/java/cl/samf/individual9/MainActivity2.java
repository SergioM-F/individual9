package cl.samf.individual9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListnerActivity2();

        Intent intentget = getIntent();
        int idImagen = intentget.getIntExtra("clave",0);

        ImageView imagebutton = findViewById(R.id.imageView);
        imagebutton.setImageResource(idImagen);
    }

    private void ListnerActivity2() {

        Button volver = (findViewById(R.id.buttonVolver));

        volver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                onBackPressed();

            }
        });
    }
}