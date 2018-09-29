package com.r0user.buttonpress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText username,password;
    TextView Result;
    public void loginButtonClicked(View view){

        EditText username = (EditText) findViewById(R.id.usernameText);
        EditText password = (EditText) findViewById(R.id.passwordText);
        Result = (TextView) findViewById(R.id.resultText);
        String name = username.getText().toString();
        String pass = password.getText().toString();
        Result.setText("username:" + name + "\nPassword:" + pass);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
