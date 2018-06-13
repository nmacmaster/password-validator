package com.example.niamh.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //create validator object
    Validator vd = new Validator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.validate);

        TextView message = findViewById(R.id.strongText);
        //hide textview until a password is submitted
        message.setVisibility(View.INVISIBLE);

    }
    //onclick method, checks if password is valid and displays appropriate message
    public void validMessage(View view){
        EditText psswd = findViewById(R.id.input);
        TextView message = findViewById(R.id.strongText);
        //show message
        message.setVisibility(View.VISIBLE);
        //if password is strong, display strong
        if(vd.isValidPassword(psswd.getText().toString()))
            message.setText("Strong.");
        //if weak, display not strong
        else
            message.setText("Not strong.");
    }

}
