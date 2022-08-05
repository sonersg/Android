package com.example.openanewactivitywithmenubar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView = findViewById(R.id.resultText);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            int i=0;
            @Override
            public void onClick(View view) {

                textView.setText("güçlü");
//                Toast.makeText(this, "worked?", Toast.LENGTH_SHORT).show();
                switch(i){
                    case 1:
                        textView.setText("Soner is so romantic!");
                        break;
                    case 2:
                        textView.setText("so smart and gentle.");
                        break;
                    case 3:
                        textView.setText("i love him.");
                        break;
                    case 4:
                        textView.setText("He will be my baby boy.");
                        break;
                }
                i++;
            }
        });
    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}