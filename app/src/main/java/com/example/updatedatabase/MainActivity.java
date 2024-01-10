package com.example.updatedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText surname;
    EditText id;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        id = findViewById(R.id.id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHelper db = new DatabaseHelper(MainActivity.this);
                boolean isUpdate = db.update(id.getText().toString(),
                    name.getText().toString(),
                    surname.getText().toString());
                if(isUpdate == true)
                    Toast.makeText(MainActivity.this, "Updated",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "Not Updated",Toast.LENGTH_LONG).show();


            }
        });
    }
}
