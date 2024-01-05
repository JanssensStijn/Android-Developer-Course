package com.stijnjanssens.stijnsandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
                new Project("Getting Started App" , "Our very first project, the default 'Hello World!' app.", R.drawable.getting_started ),
                new Project("Motivational qoute" , "App with simple change to layout, with a motivational qoute.", R.drawable.quote ),
                new Project("BMI Calculator" , "App to calculate your BMI.", R.drawable.tape),
                new Project("GInches Converter" , "App to convert inches to meters.", R.drawable.calculator ),
                new Project("The Hungry Developer" , "A menu app for a fictional restuarant.", R.drawable.hungry_developer )
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        list.setAdapter(adapter);

    }
}