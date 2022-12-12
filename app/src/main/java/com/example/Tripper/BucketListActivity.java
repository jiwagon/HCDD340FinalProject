package com.example.Tripper;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
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
        if (id == R.id.pin1){
            AlertDialog.Builder d = new AlertDialog.Builder(this);
            d.setTitle(R.string.past_city_1);
            d.setMessage(R.string.cityDetail1);
            d.setPositiveButton(android.R.string.ok, null);
            d.show();
        }
        else if (id == R.id.pin2){
            AlertDialog.Builder d = new AlertDialog.Builder(this);
            d.setTitle(R.string.past_city_2);
            d.setMessage(R.string.cityDetail2);
            d.setPositiveButton(android.R.string.ok, null);
            d.show();
        }
        else if (id == R.id.pin3){
            AlertDialog.Builder d = new AlertDialog.Builder(this);
            d.setTitle(R.string.past_city_3);
            d.setMessage(R.string.cityDetail3);
            d.setPositiveButton(android.R.string.ok, null);
            d.show();
        }
        else
            Log.d(TAG, "Unknown ID: " + id);

    }
}
