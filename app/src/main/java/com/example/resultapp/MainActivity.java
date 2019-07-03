package com.example.resultapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ResultDTO resultDTO;
    List<Datum> datum;
    ResultAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);

        recyclerView = findViewById(R.id.recyclerViewID);

        final RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        ((LinearLayoutManager) layoutManager).setOrientation(LinearLayoutManager.VERTICAL);

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

        Call<ResultDTO> call = apiInterface.getResult();
        call.enqueue(new Callback<ResultDTO>() {
            @Override
            public void onResponse(Call<ResultDTO> call, Response<ResultDTO> response) {
                if (response.isSuccessful()) {
                    System.out.println("Response success=====");
                    resultDTO = response.body();
                    System.out.println("resultDto==="+resultDTO.getData());
                    datum = resultDTO.getData();
                    adapter = new ResultAdapter(datum, MainActivity.this);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(layoutManager);


                } else {
                    System.out.println("Response not success=====");
                }
            }

            @Override
            public void onFailure(Call<ResultDTO> call, Throwable t) {
                System.out.println("Response failure====");
                System.out.println("Due to===="+t.getMessage());
            }
        });





    }
}
