package com.example.Tripper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;


public class BucketListActivity extends AppCompatActivity implements View.OnClickListener{


    private static final String TAG = "Activity 2";
    private static final int[] ACTION_ICON_IDS = {
            R.id.pin1
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket_list);

        for (int id : ACTION_ICON_IDS) {
            findViewById(id).setOnClickListener(this);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_navigation_menu, menu);
        return true;
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.pin1){
            Snackbar snackbar = Snackbar
                    .make(findViewById(android.R.id.content), R.string.past_city_1, Snackbar.LENGTH_LONG);
            snackbar.show();
        }
        else
            Log.d(TAG, "Unknown ID: " + id);

    }
}
