package com.apsara.thirdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity  {
    private Button btnLogin;
    private EditText etUserName,etPsd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUserName=findViewById(R.id.etUserName);
        etPsd=findViewById(R.id.etPsd);
        btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etUserName.getText())){
                    etUserName.setError("please enter user name");
                    etUserName.requestFocus();
                    return;
                }else if (TextUtils.isEmpty(etPsd.getText())){
                    etPsd.setError("please enter password");
                    etPsd.requestFocus();
                    return;
                }
                String UserName,Password;
                UserName=etUserName.getText().toString();
                Password=etPsd.getText().toString();
                if(Objects.equals(UserName,"softwarica") && Objects.equals(Password,"coventry")){
                    Toast.makeText(getApplicationContext(),"redirecting...",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(LoginActivity.this,"UserName and Password is not correct",
                            Toast.LENGTH_LONG).show();
                    etUserName.setText("");
                    etPsd.setText("");
                    etUserName.setVisibility(View.VISIBLE);
                }

            }
        });

    }



    }

