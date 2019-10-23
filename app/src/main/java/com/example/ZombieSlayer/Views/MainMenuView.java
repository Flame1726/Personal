package com.example.ZombieSlayer.Views;
/**
 * This class is the main menu of the game. There exists three buttons on it and
 * when one of the buttons is clicked, transition to another class.
 *
 * @author Ezrie Brant
 * @author David Chan
 * @author Francis Ynoa
 * Last Updated: 10/02/2019
 */

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ZombieSlayer.R;

public class MainMenuView extends AppCompatActivity {

    public Button startGame;
    private Button load;
    private Button settings;
    private WindowView window = new WindowView();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //How the class will look
        setContentView(R.layout.activity_main_menu);

        //Creates a Button and when clicked transition to the LoadView class.
        startGame = findViewById(R.id.startGame);
        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLoad = new Intent(getApplicationContext(), LoadView.class);
                startActivity(toLoad);
            }
        });


        //Creates a Button and when clicked transition to the Save State class.
        load = findViewById(R.id.load);
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSaveState = new Intent(getApplicationContext(), SaveStateView.class);
                startActivity(toSaveState);
            }
        });

        //Creates a Button and when clicked transition to the SettingsView class.
        settings = findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSettings = new Intent(getApplicationContext(), SettingsView.class);
                startActivity(toSettings);
            }
        });

        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.fornow);
        mediaPlayer.start();

        window.hideSystem(this);
    }
}
