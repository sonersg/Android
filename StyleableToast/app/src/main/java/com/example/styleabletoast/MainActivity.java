package com.example.styleabletoast;

import androidx.appcompat.app.AppCompatActivity;
import io.github.muddz.styleabletoast.StyleableToast;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        StyleableToast.makeText(this, "david king", R.style.exampleToast).show();
    }
}