package com.example.gslc2;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    CardView cardView;
    ImageButton showButton,hiddenButton;
    LinearLayout hiddenLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        cardView = findViewById(R.id.card_view);
        showButton = findViewById(R.id.image_button);
        hiddenButton = findViewById(R.id.up_button);
        hiddenLayout = findViewById(R.id.layout_expand);

        showButton.setOnClickListener(view->{
            if(hiddenLayout.getVisibility()== View.VISIBLE) {
                TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                hiddenLayout.setVisibility(View.GONE);
                showButton.setImageResource(R.drawable.arrow_down);
            }else {
                TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                hiddenLayout.setVisibility(View.VISIBLE);
                showButton.setImageResource(R.drawable.transparent);
                hiddenButton.setImageResource(R.drawable.arrow_up);
            }
        });

        hiddenButton.setOnClickListener(view->{
            if(hiddenLayout.getVisibility()== View.VISIBLE) {
                TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                hiddenLayout.setVisibility(View.GONE);
                showButton.setImageResource(R.drawable.arrow_down);
            }else {
                TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                hiddenLayout.setVisibility(View.VISIBLE);
                showButton.setImageResource(R.drawable.transparent);
                hiddenButton.setImageResource(R.drawable.arrow_up);
            }
        });
    }
}