package com.example.ctofconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ctofconverter.Utils.Converters;
import com.example.ctofconverter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.CtoFTitleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "It worked!", Toast.LENGTH_SHORT).show();
            }
        });

        binding.celsiusConvertButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = FtoCActivity.fToCIntentFactory(getApplicationContext());
                startActivity(intent);
                return false;
            }
        });
    }

    public void cToFConversion(View view) {
        String enteredValue = binding.celsiusValueEditText.getText().toString();
        double valueToConvert = 0;

        if (!enteredValue.isEmpty()) {
            valueToConvert = Double.parseDouble(enteredValue);
        }
        valueToConvert = Converters.celsiusToFahrenheit(valueToConvert);
        binding.celsiusConvertedValueTextView.setText(
                getString(R.string.degrees_fahrenheit, valueToConvert)
        );
    }
}