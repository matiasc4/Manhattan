package cl.ubb.manhattan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void acercade(View v){
        Intent intent= new Intent(this,Acercade.class);
        startActivity(intent);


    }

    public void Menu(View v){
        Intent intent= new Intent(this,Menu.class);
        startActivity(intent);


    }
}
