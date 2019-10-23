package com.example.ZombieSlayer.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ZombieSlayer.Models.GameModel;
import com.example.ZombieSlayer.Views.WindowView;

public class GameController extends AppCompatActivity {

    private WindowView windows = new WindowView();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameModel(this) );

        windows.hideSystem(this);
    }
}
