package android.com.vill.module;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

/**
 * Created by comfort on 11/9/2017.
 */


public class ItemAdapter extends RecyclerView.Adapter {
    private List<item>item;
    private int rate_of_exchange;
    private ContextCompat context;

    public static class itemViewHolder extends RecyclerView.ViewHolder{

        protected itemViewHolder(View view){
            super(view);


        }

    }

    public ItemAdapter(List<item> items, int rate_of_exchange, Context applicationContext) {

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    private static final String TAG = ItemAdapter.class.getSimpleName();


    public ItemAdapter() {

    }


    public String makeServiceCall(String reqUrl) {

        String response = null;

        try {

            URL url = new URL(reqUrl);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");

            // read the response

            InputStream in = new BufferedInputStream(conn.getInputStream());

            response = convertStreamToString(in);

        } catch (MalformedURLException e) {

            Log.e(TAG, "MalformedURLException: " + e.getMessage());

        } catch (ProtocolException e) {

            Log.e(TAG, "ProtocolException: " + e.getMessage());

        } catch (IOException e) {

            Log.e(TAG, "IOException: " + e.getMessage());

        } catch (Exception e) {

            Log.e(TAG, "Exception: " + e.getMessage());

        }
        return response;

    }

    private String convertStreamToString(InputStream is) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        StringBuilder sb = new StringBuilder();


        String line;

        try {

            while ((line = reader.readLine()) != null) {

                sb.append(line).append('\n');

            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                is.close();

            } catch (IOException e) {

                e.printStackTrace();

            }

        }


        return sb.toString();
    }
}

