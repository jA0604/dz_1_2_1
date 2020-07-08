package com.androidakbar.dz_1_2_1;

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

    public void clickOk(View view) {
        TextView textView = (TextView) findViewById(R.id.messageView);
        EditText userName = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText userMail = (EditText) findViewById(R.id.editTextTextEmailAddress);
        textView.setText("Подписка на рассылку успешно оформлена для пользователя "
                + userName.getText() + " на электронный адрес " + userMail.getText());
    }

    public void clickClear(View view) {
        TextView textView = (TextView) findViewById(R.id.messageView);
        textView.setText("");
    }
}