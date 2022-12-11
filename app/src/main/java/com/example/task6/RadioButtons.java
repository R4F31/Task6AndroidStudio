
package com.example.task6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtons extends AppCompatActivity {

    private RadioGroup mRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_buttons);

        mRadioGroup = findViewById(R.id.radioGroup);

        int selectedId = mRadioGroup.getCheckedRadioButtonId();
        RadioButton selectedRadioButtons = findViewById(selectedId);
        String value = selectedRadioButtons.getText().toString();

        Toast.makeText(this, value, Toast.LENGTH_SHORT).show();
    }
}