package com.example.my;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    ArrayList<State> states = new ArrayList<State>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        intent = new Intent(this, Ukrain.class);
        run();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер




        StateAdapter.OnStateClickListener stateClickListener = new StateAdapter.OnStateClickListener() {
            @Override
            public void onStateClick(State state, int position) {
                if (state.getName() == "Украина") {
                    startActivity(intent);
                }

                Toast.makeText(getApplicationContext(), "Был выбран пункт " + position,
                        Toast.LENGTH_SHORT).show();
            }
        };


        StateAdapter adapter = new StateAdapter(this, states, stateClickListener);




        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void run(){

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
