package com.example.mitbus;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewer extends AppCompatActivity {
    private PDFView pdfview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);
        ActionBar a = getSupportActionBar();
        Drawable d = getResources().getDrawable(R.color.colorAccent);
        a.setBackgroundDrawable(d);

        Intent i = getIntent();
        String fileName = i.getStringExtra("fileName");
        pdfview = (PDFView)findViewById(R.id.pdfView);
        pdfview.fromAsset(fileName).load();
    }
}