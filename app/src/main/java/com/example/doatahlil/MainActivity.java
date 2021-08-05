package com.example.doatahlil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.doatahlil.R;
import com.example.doatahlil.RecyclerView;
import com.example.doatahlil.modeldoaTahlil;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final String JSON_URL = "https://islamic-api-indonesia.herokuapp.com/api/data/json/tahlil";
    private JsonArrayRequest request;
    private RequestQueue requestQueue;
    private List<doaTahlil> doaTahlils;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doaTahlils = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerviewid)
        jsonreq();
    }

    private void jsonreq() {
        request = new JsonArrayRequest(JSON_URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i = 0; i < response.length() ; i++){
                    try {
                        jsonObject = response.getJSONObject(i);
                        doaTahlils doa = new doaTahlil();
                        doa.setName
                        
                    }
                }
            }
        })
    }
}