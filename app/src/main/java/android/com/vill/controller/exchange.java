package android.com.vill.controller;

import android.com.vill.R;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by comfort on 11/9/2017.
 */

public class exchange extends AppCompatActivity{
    private EditText count;
    private  EditText ex;
    private  EditText buy;
    private Button cup;

    private EditText egg;
    private EditText slie;
    private EditText pink;
    private Button box;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rate_of_exchange);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        count = (EditText) findViewById(R.id.country);
        buy = (EditText) findViewById(R.id.btc);
        ex = (EditText) findViewById(R.id.btc_to_usd);
        cup = (Button) findViewById(R.id.bbbt);

        egg = (EditText) findViewById(R.id.eth);
        slie = (EditText) findViewById(R.id.eth_to_usd);
        box = (Button) findViewById(R.id.transition_current_scene);


        Bundle prevIntent = getIntent().getExtras();
        final String curr = prevIntent.getString("currency");
        final double bitcoinRate = prevIntent.getDouble("bitcoin");


        Bundle preIntent = getIntent().getExtras();
        final String cur = prevIntent.getString("currency");
        final double bitcoinRater = prevIntent.getDouble("ethernum");


        cup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final double cryptInput = Double.parseDouble(buy.getText().toString());
                ex.setText("result" + convertBTCToCurrency(cryptInput, bitcoinRate) + " " + curr);

            }
        });

        box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final double currInput = Double.parseDouble(egg.getText().toString());
                slie.setText("result" + convertToEtH(currInput, bitcoinRate) + " " + curr);
            }
        });}


    private double convertBTCToCurrency(double bitcoinVal, double rate) {
        return bitcoinVal * rate;
    }

    private double convertToEtH(double bitcoinVal, double rate) {
        return bitcoinVal * rate;
    }


}





















