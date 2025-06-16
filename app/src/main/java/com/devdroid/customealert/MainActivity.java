package com.devdroid.customealert;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnAdd, btnUpdate, btnDelete, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btn_add);
        btnUpdate = findViewById(R.id.btn_update);
        btnDelete = findViewById(R.id.btn_delete);
        btnExit = findViewById(R.id.btn_exit);

        btnAdd.setOnClickListener(v -> com.devdroid.customealert.AlertHelper.showCustomDialog(this, "Add", null));
        btnUpdate.setOnClickListener(v -> com.devdroid.customealert.AlertHelper.showCustomDialog(this, "Update", null));
        btnDelete.setOnClickListener(v -> com.devdroid.customealert.AlertHelper.showCustomDialog(this, "Delete", null));
        btnExit.setOnClickListener(v -> com.devdroid.customealert.AlertHelper.showCustomDialog(this, "Exit", this::finish));
    }
}
