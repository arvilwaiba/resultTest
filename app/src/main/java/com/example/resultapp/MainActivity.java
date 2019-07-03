package com.example.resultapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);

        recyclerView = findViewById(R.id.recyclerViewID);

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

        Call<List<ResultDTO>> call = apiInterface.getResult();
        call.enqueue(new Callback<List<ResultDTO>>() {
            @Override
            public void onResponse(Call<List<ResultDTO>> call, Response<List<ResultDTO>> response) {
                if(response.isSuccessful()){
                    System.out.println("get connected =====");
                }
                else {
                    System.out.println("not connected =====");
                }

            }

            @Override
            public void onFailure(Call<List<ResultDTO>> call, Throwable t) {

                System.out.println("something went wrong ====="+t.getMessage());
            }
        });





    }
}
