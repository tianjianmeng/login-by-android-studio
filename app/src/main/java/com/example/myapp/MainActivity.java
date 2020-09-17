package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void onButtonClick(View view){

        final View viewDialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.login, null, false);

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("login").setView(viewDialog).setPositiveButton("yes", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialogInterface, int i) {
                EditText editTextUserId=viewDialog.findViewById(R.id.userId);
                EditText editTextUserPassWord=viewDialog.findViewById(R.id.password);
                        if(editTextUserId.getText().toString().equals("abc") && editTextUserPassWord.getText().toString().equals("123"))
                            Toast.makeText(MainActivity.this,"登陆成功", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this,"登陆失败", Toast.LENGTH_LONG).show();
                    }
                });
        builder.create().show();
    }
}