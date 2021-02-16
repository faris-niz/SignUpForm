package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText user, email, password, password2;
        user = findViewById(R.id.editTextTextPersonName2);
        email = findViewById(R.id.editTextTextEmailAddress2);
        password = findViewById(R.id.editTextTextPassword3);
        password2 = findViewById(R.id.editTextTextPassword4);
        Button Register = findViewById(R.id.button);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean valid = true;//this condition will check if the input is valid
                if (user.length()==0){
                    user.setError("Enter UserName");
                    valid = false;//if any of the conditions isn't met then it is not valid
                }
                if(email.length()==0){
                    email.setError("Enter Email");
                    valid = false;
                }
                if(password.length()==0){
                    password.setError("Enter password");
                    valid = false;
                }
                if(!password.getText().toString().equals(password2.getText().toString())){
                    password2.setError("passwords don't match");
                    valid = false;
                }
                if (valid==true){
                    Toast.makeText(FormActivity.this, "Welcome " + user.getText(), Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}