package flower_task.prakhar.example.com.boldkiln;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static String TAG = MainActivity.class.getSimpleName();
    private String urlJson = "http://development.easystartup.org/NO/Backend/flower.php";
    private ProgressDialog pDialog;
    private Gson gson;
    private ListView listView;
    private FlowerListAdapter flowerListAdapter;
    private EditText inputSearch;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Please wait...");
        pDialog.setCancelable(false);
        makeJsonObjectRequest();

        listView = (ListView) findViewById(R.id.listView);
        inputSearch = (EditText) findViewById(R.id.inputSearch);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Flower.DataBean dataBean = (Flower.DataBean) flowerListAdapter.getItem(i);
                Log.d("100",dataBean.getName());
                intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("imageurl", dataBean.getUrl());
                intent.putExtra("flower_name", dataBean.getName());
                startActivity(intent);
                Toast.makeText(getApplicationContext(),dataBean.getName(),Toast.LENGTH_LONG).show();
            }
        });

        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
                String text = inputSearch.getText().toString().toLowerCase(Locale.getDefault());
                flowerListAdapter.filter(text);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1,
                                          int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2,
                                      int arg3) {
                // TODO Auto-generated method stub
            }
        });
    }

    private void makeJsonObjectRequest() {

        showpDialog();

        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET,
                urlJson, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                Log.d("1","1");
//                Log.d(TAG, response.toString());
//                System.out.print("2");

                try {
                    // Parsing json object response
                    // response will be a json object
                    Log.d("2","2");
                    gson = new GsonBuilder().serializeNulls().create();
                    Log.d("10",response.getJSONArray("data").toString());
                    Flower.DataBean[] dataBean = gson.fromJson(response.getJSONArray("data").toString(), Flower.DataBean[].class);
                    Log.d("15", dataBean[0].getName());
//                    for(int i=0;i<dataBean.length;i++){
//                        if (dataBean[i] != null) {
//                            Log.d(String.valueOf(i), String.valueOf(dataBean[i].getName()));
//                        }
//                    }
                    flowerListAdapter = new FlowerListAdapter(getApplicationContext(), Arrays.asList(dataBean));
                    listView.setAdapter(flowerListAdapter);

                } catch (JSONException e) {
//                    System.out.print("5");
                    Log.d("4","4");
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(),
                            "Error: " + e.getMessage(),
                            Toast.LENGTH_LONG).show();
                }
                hidepDialog();
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("5","5");
//                System.out.print("6");
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_SHORT).show();
                // hide the progress dialog
                hidepDialog();
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq);
    }


    private void showpDialog() {
        if (!pDialog.isShowing())
            pDialog.show();
    }

    private void hidepDialog() {
        if (pDialog.isShowing())
            pDialog.dismiss();
    }
}
