package com.ibitech.s216234670.ibitech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__page);
        final EditText idNumber= (EditText) findViewById(R.id.idNumber);
        final EditText contactNumber= (EditText) findViewById(R.id.contactNumber);
        final EditText password= (EditText) findViewById(R.id.password);
        final Button BLogin= (Button) findViewById(R.id.BLogin);
        final TextView Reg_link= (TextView) findViewById(R.id.Reg_Link);
        final TextView ForgotPassword= (TextView) findViewById(R.id.ForgotPassword);

                Reg_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent registerIntent = new Intent(Register_Page.this,Login.class);
                        Register_Page.this  .startActivity(registerIntent);
                    }
                });

    }
}
