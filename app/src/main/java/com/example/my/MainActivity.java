package com.example.my;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер
        StateAdapter adapter = new StateAdapter(this, states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){

        states.add(new State ("Бразилия", "Бразилиа", R.drawable.brazil));
        states.add(new State ("Аргентина", "Буэнос-Айрес", R.drawable.anrgen));
        states.add(new State ("Колумбия", "Богота", R.drawable.kolumb));
        states.add(new State ("Украина", "Киев", R.drawable.ukr));
        states.add(new State ("Россия", "Москва", R.drawable.ros));
        states.add(new State ("Россия", "Москва", R.drawable.ros));
        states.add(new State ("Россия", "Москва", R.drawable.ros));
        states.add(new State ("Россия", "Москва", R.drawable.ros));
        states.add(new State ("Россия", "Москва", R.drawable.ros));
        states.add(new State ("Россия", "Москва", R.drawable.ros));
        states.add(new State ("Россия", "Москва", R.drawable.ros));
        states.add(new State ("Россия", "Москва", R.drawable.ros));
        states.add(new State ("Россия", "Москва", R.drawable.ros));
    }
}
