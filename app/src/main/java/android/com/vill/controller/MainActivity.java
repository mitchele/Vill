package android.com.vill.controller;

import android.com.vill.R;
import android.com.vill.api.client;
import android.com.vill.api.service;
import android.com.vill.module.ItemAdapter;
import android.com.vill.module.item;
import android.com.vill.module.itemResponse;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {




    private String [] mCurrencies = {"USD","EUR","KES", "GBP","ZAR","BSD","CHF",
            "COP","CLP","DZD","EGP","ILS","INR","JPY","KPW","KRW","LYD","LRD","NGN","TZS"};

    private RecyclerView recyclerView;
    private EditText mCreateBtC;
    private EditText mCreateEth;
    private EditText mCreateCountry;
    private List<item>item;
    private ContextCompat context;
    private String mSelectedItem = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mCreateBtC = (EditText) findViewById(R.id.btc_to_usd);
        mCreateEth = (EditText) findViewById(R.id.eth_to_usd);
        mCreateCountry = (EditText) findViewById(R.id.country);
    }

    private void initViews() {

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.smoothScrollToPosition(0);
        LoadJSON();
    }

    private void LoadJSON() {
        client client  = new client();
        service apiService =
          client.getClient().create(service.class);
        Call<itemResponse> call = apiService.getItems();
        call.enqueue(new Callback<itemResponse>() {
            @Override
            public void onResponse(Call<itemResponse> call, Response<itemResponse> response) {

                List<item> items = response.body().getItems();
                recyclerView.setAdapter(new ItemAdapter(items, R.layout.rate_of_exchange, getApplicationContext()));
                recyclerView.smoothScrollToPosition(0);

            }

            @Override
            public void onFailure(Call<itemResponse> call, Throwable t) {
                Log.d("Error", t.getMessage());
                Toast.makeText(MainActivity.this, "Unable to get exchange", Toast.LENGTH_SHORT).show();


            }
        });

    }}





