package com.example.andriod.tipcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent msIntent = getIntent();
        Question question = (Question) msIntent.getSerializableExtra(Keys.QUESTION_KEY);

        setTitle("Your Reciept");
        TextView name = findViewById(R.id.description_view1);
        name.setText(question.getAmount());

        TextView date = findViewById(R.id.description_view2);
        date.setText(question.getTax());

        TextView wfh = findViewById(R.id.description_view3);
        wfh.setText(question.getTip());

        double totalN = question.getAmountN() + question.getTipN() + question.getTaxN();
        String totall = "Grand Total: " + totalN;

        TextView reason = findViewById(R.id.description_view4);
        reason.setText(totall);

    }

}
