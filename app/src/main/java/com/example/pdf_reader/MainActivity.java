package com.example.pdf_reader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.pdf.PdfDocument;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity
{
    PDFView pdf;
    Intent Fintent;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdf = findViewById(R.id.pdf1);
        Fintent = getIntent();

        if (Fintent.getAction() == ( Intent.ACTION_VIEW )) {
            pdf.fromUri(Fintent.getData()).load();
        }

    }
}
