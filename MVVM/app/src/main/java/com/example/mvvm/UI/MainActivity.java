package com.example.mvvm.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvvm.POJO.MovieModel;
import com.example.mvvm.R;

public class MainActivity extends AppCompatActivity {
    TextView text ;
    Button button;
    ViewModel movieModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
        movieModel = new  ViewModelProvider(this).get(ViewModel.class);
        movieModel.MutableLiveDataName.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                text.setText(s);
            }
        });

    }

    public void onClick(View view) {
        movieModel.getMovieName();
    }
}