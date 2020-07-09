package com.androidakbar.dz_1_2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected TextView textView;
    protected EditText userName;
    protected EditText userMail;
    protected String message = "Подписка на рассылку успешно оформлена для пользователя ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.messageView);
        userName = (EditText) findViewById(R.id.editTextTextPersonName);
        userMail = (EditText) findViewById(R.id.editTextTextEmailAddress);

    }

    public void clickOk(View view) {
        message += userName.getText() + " на электронный адрес " + userMail.getText();
        textView.setText(message);
    }

    public void clickClear(View view) {
        textView.setText("");
    }
}