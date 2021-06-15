package com.example.mitbus;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class BusRoute extends AppCompatActivity {

    String[] bus = {"BR1","BR2","BR3","BR4","BR5","BR6","BR7","BR8","BR9","BR10","BR11","BR12","BR13","BR14","BR15","BR16","BR17","BR18","BR19","BR20","BR21","BR22","BR23","BR24","BR25","BR26","BR27","BR28","BR29","BR30","BR31","BR32","BR33","BR34","BR35","BR36","BR37","BR38","BR39","BR40","BR41","BR42","BR43","BR44","BR45","BR46","BR47","BR48","BR49","BR50","BR51","BR52","BR53","BR54","BR55","BR56","BR57"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_route);
        ActionBar a = getSupportActionBar();
        Drawable d = getResources().getDrawable(R.color.colorAccent);
        a.setBackgroundDrawable(d);

        Spinner MySpinner2 = (Spinner)findViewById(R.id.bus);
        ArrayAdapter<String> myAdapter2 = new
                ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, bus);
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        MySpinner2.setAdapter(myAdapter2);

    }

    public void tvnext(View view){
        Intent i = new Intent(BusRoute.this, PdfViewer.class);
        Spinner mySpinner = (Spinner) findViewById(R.id.bus);
        String text = mySpinner.getSelectedItem().toString();



        String pdfName = "BR";
        if(text.equals("BR1")){
            pdfName += "1";
        }else if(text.equals("BR2")){
            pdfName += "2";}
        else if(text.equals("BR3")){
            pdfName += "3";}
        else if(text.equals("BR4")){
            pdfName += "4";}
        else if(text.equals("BR5")){
            pdfName += "5";}
        else if(text.equals("BR6")){
            pdfName += "6";}
        else if(text.equals("BR7")){
            pdfName += "7";}
        else if(text.equals("BR8")){
            pdfName += "8";}
        else if(text.equals("BR9")){
            pdfName += "9";}
        else if(text.equals("BR10")){
            pdfName += "10";}
        else if(text.equals("BR11")){
            pdfName += "11";}
        else if(text.equals("BR12")){
            pdfName += "12";}
        else if(text.equals("BR13")){
            pdfName += "13";}
        else if(text.equals("BR14")){
            pdfName += "14";}
        else if(text.equals("BR15")){
            pdfName += "15";}
        else if(text.equals("BR16")){
            pdfName += "16";}
        else if(text.equals("BR17")){
            pdfName += "17";}
        else if(text.equals("BR18")){
            pdfName += "18";}
        else if(text.equals("BR19")){
            pdfName += "19";}
        else if(text.equals("BR20")){
            pdfName += "20";}
        else if(text.equals("BR21")){
            pdfName += "21";}
        else if(text.equals("BR22")){
            pdfName += "22";}
        else if(text.equals("BR23")){
            pdfName += "23";}
        else if(text.equals("BR24")){
            pdfName += "24";}
        else if(text.equals("BR25")){
            pdfName += "25";}
        else if(text.equals("BR26")){
            pdfName += "26";}
        else if(text.equals("BR27")){
            pdfName += "27";}
        else if(text.equals("BR28")){
            pdfName += "28";}
        else if(text.equals("BR29")){
            pdfName += "29";}
        else if(text.equals("BR30")){
            pdfName += "30";}
        else if(text.equals("BR31")){
            pdfName += "31";}
        else if(text.equals("BR32")){
            pdfName += "32";}
        else if(text.equals("BR34")){
            pdfName += "34";}
        else if(text.equals("BR35")){
            pdfName += "35";}
        else if(text.equals("BR36")){
            pdfName += "36";}
        else if(text.equals("BR37")){
            pdfName += "37";}
        else if(text.equals("BR38")){
            pdfName += "38";}
        else if(text.equals("BR39")){
            pdfName += "39";}
        else if(text.equals("BR40")){
            pdfName += "40";}
        else if(text.equals("BR41")){
            pdfName += "41";}
        else if(text.equals("BR42")){
            pdfName += "42";}
        else if(text.equals("BR43")){
            pdfName += "43";}
        else if(text.equals("BR44")){
            pdfName += "44";}
        else if(text.equals("BR45")){
            pdfName += "45";}
        else if(text.equals("BR46")){
            pdfName += "46";}
        else if(text.equals("BR47")){
            pdfName += "47";}
        else if(text.equals("BR48")){
            pdfName += "48";}
        else if(text.equals("BR49")){
            pdfName += "49";}
        else if(text.equals("BR50")){
            pdfName += "50";}
        else if(text.equals("BR51")){
            pdfName += "51";}
        else if(text.equals("BR52")){
            pdfName += "52";}
        else if(text.equals("BR53")){
            pdfName += "53";}
        else if(text.equals("BR54")){
            pdfName += "54";}
        else if(text.equals("BR55")){
            pdfName += "55";}
        else if(text.equals("BR56")){
            pdfName += "56";}
        else if(text.equals("BR57")){
            pdfName += "57";}

        if(view.getId()==R.id.textViewnext){
            pdfName+=".pdf";
        }
        i.putExtra("fileName",pdfName);
        startActivity(i);
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
            case R.id.nav_home:
                Intent i= new Intent(BusRoute.this,MainActivity.class);
                startActivity(i);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}