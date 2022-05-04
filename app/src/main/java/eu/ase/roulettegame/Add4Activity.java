package eu.ase.roulettegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Add4Activity extends AppCompatActivity {

    EditText et1, et2, et3, et4;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add4);

        initComponents();
    }

    private void initComponents() {
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String drink1 = et1.getText().toString();
                String drink2 = et2.getText().toString();
                String drink3 = et3.getText().toString();
                String drink4 = et4.getText().toString();

                Intent intent = new Intent(getApplicationContext(), Add4RouletteActivity.class);
                intent.putExtra("keydrink1", drink1);
                intent.putExtra("keydrink2", drink2);
                intent.putExtra("keydrink3", drink3);
                intent.putExtra("keydrink4", drink4);
                startActivity(intent);

            }
        });

    }
}