package com.example.vsharko.eurotokunaconverter;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {
    public void Convert(View view){
        double magicNumber = 7.41035367;
        double amountEuro, amountKuna;
        EditText Euro = (EditText) findViewById(R.id.userInput);
        amountEuro = Double.parseDouble(Euro.getText().toString());
        amountKuna=(double) Math.round((magicNumber*amountEuro)*100.0)/100;
        String text = Double.toString(amountKuna);
        TextView Kuna=(TextView)findViewById(R.id.Kuna);
        Kuna.setText(text + " Kn");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
