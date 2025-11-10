package com.example.messingaround;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button descriptionChangeButton;
    TextView descriptionTextView;

    @Override
    protected void onCreate(Bundle steven) {
        super.onCreate(steven);
        setContentView(R.layout.activity_main);

        descriptionChangeButton = (Button) findViewById(R.id.changeDescriptionButton);
        descriptionTextView = (TextView) findViewById(R.id.changeDescriptionButton);
        descriptionChangeButton.setOnClickListener(new View.OnClickListener() {
            boolean isVisible = false;
            @Override
            public void onClick(View v) {
                if (!isVisible) {
                    descriptionChangeButton.setVisibility(View.INVISIBLE);
                }
                if (descriptionTextView.getVisibility() == View.INVISIBLE) {
                    Toast.makeText(getApplicationContext(), "It's invisible!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "It's not invisible and I don't know what it's gonna do!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}