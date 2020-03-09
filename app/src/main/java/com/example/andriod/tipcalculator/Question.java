package com.example.andriod.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;


public class Question extends AppCompatActivity implements Serializable{
    double amount;
    double tax;
    double tip;

    public Question(double amount, double tax, double tip){
        this.amount = amount;
        this.tax = tax;
        this.tip= tip;

    }

    public String getAmount(){
        return "Total: " + amount;
    }

    public String getTax(){
        return "Sales Tax: " + tax*amount;
    }
    public String getTip(){ return "Tip: " + tip*amount;}


    public double getAmountN(){
        return amount;
    }

    public double getTaxN(){
        return tax*amount;
    }

    public double getTipN(){ return tip*amount;}




    public double getTotal(){ return  amount ;}
}
