package com.example.ZombieSlayer.Views;
/**
 * This class will hold a save state of the player's progress in the game.
 *
 * @author Ezrie Brant
 * @author David Chan
 * @author Francis Ynoa
 * Last Updated: 10/02/2019
 */

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ZombieSlayer.R;

public class SaveStateView extends AppCompatActivity {
    private WindowView window = new WindowView();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_game);

        window.hideSystem(this);
    }

}
