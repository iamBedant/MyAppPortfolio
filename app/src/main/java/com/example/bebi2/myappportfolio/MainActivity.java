package com.example.bebi2.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.spotify_streamer).setOnClickListener(this);
        findViewById(R.id.scores_app).setOnClickListener(this);
        findViewById(R.id.library_app).setOnClickListener(this);
        findViewById(R.id.build_it_bigger).setOnClickListener(this);
        findViewById(R.id.xyz_reader).setOnClickListener(this);
        findViewById(R.id.my_own_app).setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        String toastMessage = "This Button will launch ";
        switch (v.getId()) {
            case R.id.spotify_streamer:
                DisplayToast.DisplayLongToast(mContext, toastMessage +getString(R.string.spotify_streamer) + " app");
                break;

            case R.id.scores_app:
                DisplayToast.DisplayLongToast(mContext, toastMessage + getString(R.string.scores_app) + " app");
                break;

            case R.id.library_app:
                DisplayToast.DisplayLongToast(mContext, toastMessage + getString(R.string.library_app) + " app");
                break;

            case R.id.build_it_bigger:
                DisplayToast.DisplayLongToast(mContext, toastMessage + getString(R.string.build_it_bigger) + " app");
                break;

            case R.id.xyz_reader:
                DisplayToast.DisplayLongToast(mContext, toastMessage + getString(R.string.xyz_reader) + " app");
                break;

            case R.id.my_own_app:
                DisplayToast.DisplayLongToast(mContext, toastMessage + getString(R.string.capstone_my_own_app) + " app");
                break;
        }
    }
}
