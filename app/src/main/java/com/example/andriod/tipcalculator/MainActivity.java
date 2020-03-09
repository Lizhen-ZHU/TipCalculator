package com.example.andriod.tipcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Question> sendRequest = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void launch(View view) {
        EditText titleTextView = (EditText) findViewById(R.id.album_description_view1);
        EditText msgTextView = (EditText) findViewById(R.id.album_description_view2);
        EditText rsTextView = (EditText) findViewById(R.id.album_description_view3);

        double amount = Double.valueOf(titleTextView.getText().toString());
        double tax = Double.valueOf(msgTextView.getText().toString());
        double tip = Double.valueOf(rsTextView.getText().toString());

        sendRequest.add(new Question(amount, tax, tip));
        Intent intent = new Intent(this, ShowActivity.class);
        Question sent = sendRequest.get(0);
        intent.putExtra(Keys.QUESTION_KEY, sent);
        startActivity(intent);
        sendRequest.remove(0);
    }
}
