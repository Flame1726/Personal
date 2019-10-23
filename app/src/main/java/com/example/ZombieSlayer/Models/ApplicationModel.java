package com.example.ZombieSlayer.Models;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ZombieSlayer.Views.LoadView;

public class ApplicationModel extends AppCompatActivity {

    public void transition(final Context _where, final Class t, TextView _class) {
        _class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent transition = new Intent(_where, t);
                startActivity(transition);
            }
        });
    }
}
