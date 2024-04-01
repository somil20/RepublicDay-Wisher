package com.example.republicday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button btn ;
    private String[] wishes = {" ",
            "Proud Indian, Happy Republic Day!",
            "Unity in diversity, celebrating our Republic!",
            "Jai Hind! Happy Republic Day to all.",
            "Freedom's pride, Happy Republic Day!",
            "India shines, Happy Republic Day!",
            "Vibrant Republic, Joyful Celebrations!",
            "Saluting our Nation, Happy Republic Day!",
            "Patriotism soars, Republic Day cheer!",
            "Jai Bharat! Happy Republic Day!",
            "Nation's glory, Republic Day story!",
            "Unity in diversity, celebrating India's vibrant spirit.",

            /* Add more wishes as needed */
    };

    private int currentWishIndex = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.mytxt);
        btn = findViewById(R.id.button);

        // Display the initial wish
        displayWish();



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Display the next wish on button click
                nextWish();
            }
        });

    }
    private void displayWish() {
        txt.setText(wishes[currentWishIndex]);
    }

    private void nextWish() {
        currentWishIndex = (currentWishIndex + 1) % wishes.length; // Loop back to the first wish if the last is reached
        displayWish();
    }
}
