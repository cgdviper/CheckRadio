package com.example.mapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    CheckBox cb1,cb2;
    RadioButton rb1,rb2;
    TextView lb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        cb1 = (CheckBox) findViewById(R.id.checkOP1);
        cb2 = (CheckBox) findViewById(R.id.checkOP2);
        rb1 = (RadioButton) findViewById(R.id.radioButtonMasculino) ;
        rb2 = (RadioButton) findViewById(R.id.radioButtonFemenino);
        lb1 = (TextView) findViewById(R.id.txtSeleccionados);

        rb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(rb1.isChecked())
                    lb1.setText("MASCULINO");
            }
        });

        rb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(rb2.isChecked())
                lb1.setText("FEMENINO");
            }
        });


        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(cb1.isChecked())
                {
                    cb1.append(" Seleccionado");
                }
                else
                {
                    cb1.setText("Opcion 1");
                }
            }
        });


        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(cb2.isChecked())
                {
                    cb2.append(" Seleccionado");
                }
                else
                {
                    cb2.setText("Opcion 2");
                }
            }
        });

    }
}
