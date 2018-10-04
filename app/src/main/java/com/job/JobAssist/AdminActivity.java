package com.job.JobAssist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AdminActivity extends AppCompatActivity implements View.OnClickListener{
    EditText adminemailid,adminpwd;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        adminemailid=(EditText)findViewById(R.id.admin_email);
        adminpwd=(EditText)findViewById(R.id.admin_password);
        findViewById(R.id.btn_signin_admin).setOnClickListener(this);





    }
    private void AdminLogin(){
        String email = adminemailid.getText().toString().trim();
        String password = adminpwd.getText().toString().trim();


        if (email.isEmpty()){
            adminemailid.setError("Email is required");
            adminemailid.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            adminemailid.setError("Please enter valid email");
            adminemailid.requestFocus();
            return;
        }

        if (password.isEmpty()){
            adminpwd.setError("Password is required");
            adminpwd.requestFocus();
            return;
        }
        if(email.equals("admin@gmail.com") && password.equals("admin")){
            Intent intent=new Intent(this,AdminMain.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Wrong email or password",Toast.LENGTH_SHORT).show();
        }
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_signin_admin:
                AdminLogin();
                break;
        }
    }
}