package com.example.ZombieSlayer.Views;
/**
 * This class is used as a transition from pressing Start -> GameController.
 *
 * @author Ezrie Brant
 * @author David Chan
 * @author Francis Ynoa
 * Last Updated: 10/02/2019
 */

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ZombieSlayer.Controller.GameController;
import com.example.ZombieSlayer.R;

public class LoadView extends AppCompatActivity {
    private int timeWait = 5000; //This number is used for milliseconds.
    private WindowView window = new WindowView();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        nextActivity();

        window.hideSystem(this);
    }

    /**
     * This method adds a wait time before the load screen transitions to the game.
     */
    public void nextActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mainIntent = new Intent(LoadView.this, GameController.class);
                LoadView.this.startActivity(mainIntent);
                LoadView.this.finish();
            }
        }, timeWait);
    }
}
