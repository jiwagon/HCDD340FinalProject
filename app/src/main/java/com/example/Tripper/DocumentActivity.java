package com.example.Tripper;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
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
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuId = item.getItemId();

        if (menuId == R.id.home_label) {
            Log.d(TAG, "Home page clicked");
            Intent MainIntent = new Intent(this, MainActivity.class);
            startActivity(MainIntent);
            return true;
        } else if (menuId == R.id.bucket_list_label) {
            Log.d(TAG, "Bucket list page clicked");
            Intent bucketListIntent = new Intent(this, BucketListActivity.class);
            startActivity(bucketListIntent);
            return true;
        }else if (menuId == R.id.docs_label) {
            Log.d(TAG, "Document page clicked");
            Intent DocumentListIntent = new Intent(this, DocumentActivity.class);
            startActivity(DocumentListIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
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
