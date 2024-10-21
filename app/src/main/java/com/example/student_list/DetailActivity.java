package com.example.student_list;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Student student = (Student) getIntent().getSerializableExtra("student");

        TextView nameText = findViewById(R.id.detailName);
        TextView idText = findViewById(R.id.detailId);
        Button backButton = findViewById(R.id.backButton);

        nameText.setText(student.getName());
        idText.setText(student.getStudentId());

        backButton.setOnClickListener(v -> finish());
    }
}