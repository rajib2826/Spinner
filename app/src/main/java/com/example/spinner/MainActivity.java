package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Spinner mySpinner;
 EditText nameText, idText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySpinner=findViewById(R.id.spinnerID);
        nameText=findViewById(R.id.NameeditText);
        idText=findViewById(R.id.IDeditText);
        ArrayAdapter<CharSequence> myAdapter=ArrayAdapter.createFromResource(this,R.array.departmentArray,android.R.layout.simple_spinner_item);
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
    }

    public void submitFunction(View view) {
        String name, id, depart;
        name=nameText.getText().toString();
        id=idText.getText().toString();
        depart=mySpinner.getSelectedItem().toString();
        Toast.makeText(this, ""+name+" "+id+" "+depart , Toast.LENGTH_SHORT).show();

    }
}