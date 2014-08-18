package com.example.nino.pracroidsupportlib;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    String message = "Android: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(message, "The onCreate Event");
    }

    protected void onStart() {
        super.onStart();
        Log.d(message, "The onStart Event");
    }

    protected void onResume(){
        super.onResume();
        Log.d(message, "The onResume Event");
    }

    protected void onPause(){
        super.onPause();
        Log.d(message, "The onPause Event");
    }

    protected void onStop(){
        super.onStop();
        Log.d(message, "The onStop Event");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d(message, "The onDestroy Event");
    }

    public void startService(View view){
        startService(new Intent(getBaseContext(), TestService.class));
    }

    public void stopService(View view){
        stopService(new Intent(getBaseContext(), TestService.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
