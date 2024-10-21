package com.example.student_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private StudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new StudentAdapter(this, createStudentsData());
        recyclerView.setAdapter(adapter);
    }
    public List<Student> createStudentsData() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("11124623", "王大明"));
        studentList.add(new Student("45642352", "王小明"));
        studentList.add(new Student("5673434", "王忠明"));
        return studentList;
    }
}