package com.example.lr_3_4_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
//private — имеют доступ только методы самого объекта.
//protected — имеют доступ методы объекта и его потомков.
//public — кто угодно.
public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    boolean button1Pressed;
    boolean button2Pressed;
//@Override: Аннотация, которая указывает, что метод переопределяет метод базового класса (AppCompatActivity)
    @Override
//onCreate() вызывается при создании или перезапуска активности
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button1);//findViewById для поиска элемента по его идентификатору (id) в разметке
        b1.setOnClickListener(click1);//Устанавливается обработчик нажатия для кнопки b1.
        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(click2);
    }
//определяет метод onClick(View v).
// Метод onClick вызывается, когда пользователь нажимает на элемент интерфейса,
// который имеет установленный обработчик нажатия
    View.OnClickListener click1 = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (!button1Pressed){
                button2Pressed = false;
                button1Pressed = true;
                Toast.makeText(MainActivity.this, "Кондрашин", Toast.LENGTH_SHORT).show();
            }
        }
    };
    View.OnClickListener click2 = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (!button2Pressed) {
                button1Pressed = false;
                button2Pressed = true;
                Toast.makeText(MainActivity.this, "Кондрашин", Toast.LENGTH_SHORT).show();
            }
        }
    };
}