package com.example.mitbus;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = (TextView) findViewById(R.id.t8);
        text.setMovementMethod(LinkMovementMethod.getInstance());
        ActionBar a = getSupportActionBar();
        Drawable d = getResources().getDrawable(R.color.colorAccent);
        a.setBackgroundDrawable(d);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.bottom_navigation,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.nav_info:
                Intent i= new Intent(MainActivity.this,BusRoute.class);
                startActivity(i);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}