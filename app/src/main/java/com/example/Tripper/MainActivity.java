package com.example.Tripper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "Activity 1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView v = findViewById(R.id.bottom_navigation);
        v.setOnNavigationItemSelectedListener(this);
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
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.bucket_list_label) {
            Intent bucketListIntent = new Intent(this, BucketListActivity.class);
            startActivity(bucketListIntent);
            return true;
        }
        if (item.getItemId() == R.id.home_label) {
            Intent homeIntent = new Intent(this, MainActivity.class);
            startActivity(homeIntent);
            return true;
        }
        else {
            Log.d(TAG, "Unknown item id in bottom nav!");
            return true;
        }
        // return false;
    }
}