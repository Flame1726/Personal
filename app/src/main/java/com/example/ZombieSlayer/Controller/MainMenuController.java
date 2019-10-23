package com.example.ZombieSlayer.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ZombieSlayer.Models.ApplicationModel;
import com.example.ZombieSlayer.R;
import com.example.ZombieSlayer.Views.LoadView;
import com.example.ZombieSlayer.Views.MainMenuView;
import com.example.ZombieSlayer.Views.SaveStateView;
import com.example.ZombieSlayer.Views.SettingsView;

public class MainMenuController extends AppCompatActivity {

    private LoadView load= new LoadView();
    private MainMenuView mainMenu = new MainMenuView();
    private SaveStateView saveState = new SaveStateView();
    private SettingsView settings = new SettingsView();
    private ApplicationModel appModel = new ApplicationModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_menu);
        //main menu buttons
        appModel.transition(mainMenu.getApplicationContext(), load.getClass(), mainMenu.startGame);

    }
}
