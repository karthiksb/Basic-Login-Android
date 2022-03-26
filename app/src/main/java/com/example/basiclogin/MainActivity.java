package com.example.basiclogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText username,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username =(EditText) findViewById(R.id.username);
        password =(EditText) findViewById(R.id.password);

        login =(Button) findViewById(R.id.login);

        String user ="karthik";
        String pass ="pass";

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String username_val =username.getText().toString().trim();
               String password_val = password.getText().toString().trim();

               if (username_val.equals(user)&& password_val.equals(pass)){

                   Toast.makeText(getApplicationContext(),"login succcess",Toast.LENGTH_LONG).show();

                   Intent intent = new Intent(MainActivity.this,secondActivity.class);

                   Bundle bundle = new Bundle();
                   bundle.putString("user",user);
                   intent.putExtras(bundle);
                   startActivity(intent);
               }

            }
        });


    }
}