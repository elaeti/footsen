package com.devoir.footsen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    private EditText txtUserName1,txtPassWord1;
    private Button btnSignIn;
    private String userName,passWord;
    private TextView signIn;
    private ImageView goBackIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        txtUserName1=findViewById(R.id.txtUserName1);
        txtPassWord1=findViewById(R.id.txtPassWord1);
        btnSignIn=findViewById(R.id.btnSignIn);
        //signIn=findViewById(R.id.signInBtn);
        //goBackIcon=findViewById(R.id.goBackIcon);

        //signUp=findViewById(R.id.signUpBtn);
        // goBackIcon1=findViewById(R.id.goBackIcon);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userName=txtUserName1.getText().toString().trim();
                passWord=txtPassWord1.getText().toString().trim();
                if ( userName.isEmpty() || passWord.isEmpty())
                {
                    String error = getString(R.string.error_fields);
                    Toast.makeText(SignInActivity.this, error, Toast.LENGTH_SHORT).show();
                }
                else
                {

                    Intent intent = new Intent(SignInActivity.this,HomeActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
   /*  public  void goBack1(View view){
         Intent intent = new Intent(SignInActivity.this,MainActivity.class);
         startActivity(intent);
     }
     public void signUp(View viex){
         Intent intent = new Intent(SignInActivity.this,SignUpActivity.class);
         startActivity(intent);
     }*/
}
