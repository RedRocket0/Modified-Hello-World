package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onBtnClick(View view) {
        TextView txtfirstname = findViewById(R.id.txtMessage);
        EditText txtName = findViewById(R.id.txtName);
        txtfirstname.setText("First Name: " + txtName.getText().toString());
        TextView txtlastname = findViewById(R.id.txtlastname);
        EditText edtlastname = findViewById(R.id.txtName2);
        txtlastname.setText("Last Name: " + edtlastname.getText().toString());
        TextView txtemail = findViewById(R.id.txtemail);
        EditText edtemail = findViewById(R.id.email);
        txtemail.setText("Email: " + edtemail.getText().toString());
    }
}