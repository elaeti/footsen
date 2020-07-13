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

public class SignUpActivity extends AppCompatActivity {

    private EditText txtFirstName,txtLastName,txtUserName,txtPassWord;
    private Button btnSignUp;
    private String firstName,lastName,userName,passWord;
<<<<<<< HEAD
=======
    private BdUser db ;
>>>>>>> f0250f6... auth
    //private TextView signIn;
    //private ImageView goBackIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
<<<<<<< HEAD
=======
        db = new BdUser(this);
>>>>>>> f0250f6... auth
        txtFirstName=findViewById(R.id.txtFirstName);
        txtLastName=findViewById(R.id.txtLastName);
        txtUserName=findViewById(R.id.txtUserName);
        txtPassWord=findViewById(R.id.txtPassWord);
        btnSignUp=findViewById(R.id.btnSignUp);
<<<<<<< HEAD
=======

>>>>>>> f0250f6... auth
        //signIn=findViewById(R.id.signInBtn);
       // goBackIcon=findViewById(R.id.goBackIcon);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                firstName=txtFirstName.getText().toString().trim();
                lastName=txtLastName.getText().toString().trim();
                userName=txtUserName.getText().toString().trim();
                passWord=txtPassWord.getText().toString().trim();
                if (firstName.isEmpty() || lastName.isEmpty() || userName.isEmpty() || passWord.isEmpty())
                {
                    String error = getString(R.string.error_fields);
                    Toast.makeText(SignUpActivity.this, error, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String success = getString(R.string.success_save);
                    Toast.makeText(SignUpActivity.this, success, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignUpActivity.this,SignInActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
   /* public void goBack(View view) {
        Intent ic = new Intent(SignUpActivity.this,MainActivity.class);
        startActivity(ic);
    }

    public void signIn(View view){
        Intent signIn = new Intent(SignUpActivity.this,SignInActivity.class);
        startActivity(signIn);
    }*/
}
=======

                firstName = txtFirstName.getText().toString().trim();
                lastName = txtLastName.getText().toString().trim();
                userName = txtUserName.getText().toString().trim();
                passWord = txtPassWord.getText().toString().trim();

                boolean b = db.create(firstName, lastName, userName, passWord);
                if (b == true){
                    Toast.makeText(SignUpActivity.this, "Utilisateur créé", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                    startActivity(intent);}
                  else
                {Toast.makeText(SignUpActivity.this, "Utilisateur non créé", Toast.LENGTH_SHORT).show();}

            }

            });



}
    }
>>>>>>> f0250f6... auth
