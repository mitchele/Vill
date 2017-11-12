package android.com.vill.api;

import android.com.vill.module.itemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by comfort on 11/9/2017.
 */

public interface service {


    @GET("/data/pricemulti?fsyms=BTC,ETH&tsyms=NGN,USD,\n" +
            "EUR,JPY,GBP,AUD,CAD,CHF,CNY,KES,GHS,UGX,ZAR,XAF,NZD,MYR,BND,GEL,RUB,INR")
    Call<itemResponse> getItems();

}
