package com.example.Tripper;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class DocumentActivity extends AppCompatActivity implements View.OnClickListener{

    private static final int[] ACTION_IMAGE_IDS = {
            R.id.i20_image,
            R.id.visa_image,
            R.id.i94_image
    };
    private static final String TAG = "Activity 4";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document);

        for (int id : ACTION_IMAGE_IDS) {
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
        if (id == R.id.i20_image){
            Snackbar snackbar = Snackbar
                    .make(findViewById(android.R.id.content), R.string.i20_detail, Snackbar.LENGTH_LONG);
            snackbar.show();
        }
        else if(id == R.id.visa_image){
            Snackbar snackbar = Snackbar
                    .make(findViewById(android.R.id.content), R.string.visa_detail, Snackbar.LENGTH_LONG);
            snackbar.show();
        }
        else if(id == R.id.i94_image){
            Snackbar snackbar = Snackbar
                    .make(findViewById(android.R.id.content), R.string.i94_detail, Snackbar.LENGTH_LONG);
            snackbar.show();
        }
        else
            Log.d(TAG, "Unknown ID: " + id);
    }
}
