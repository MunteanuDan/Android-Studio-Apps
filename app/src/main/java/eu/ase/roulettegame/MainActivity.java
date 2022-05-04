package eu.ase.roulettegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn_add_3, btn_add_4, btn_add_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// aa

        btn_add_3 = findViewById(R.id.btn_ad3);
        btn_add_4 = findViewById(R.id.btn_add4);
        btn_add_5 = findViewById(R.id.btn_add5);

        btn_add_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Add3Activity.class);
                startActivity(intent);

            }
        });

        btn_add_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Add4Activity.class);
                startActivity(intent);
            }
        });

        btn_add_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Add5Activity.class);
                startActivity(intent);
            }
        });

    }

}