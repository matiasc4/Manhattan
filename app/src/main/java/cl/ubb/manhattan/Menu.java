package cl.ubb.manhattan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void italiano(View v){
        Intent intent= new Intent(this,italiano.class);
        startActivity(intent);
    }

    public void aleman(View v){
        Intent intent= new Intent(this,aleman.class);
        startActivity(intent);
    }

    public void barrosluco(View v){
        Intent intent= new Intent(this,barrosluco.class);
        startActivity(intent);
    }

    public void mechada(View v){
        Intent intent= new Intent(this,mechada.class);
        startActivity(intent);
    }

    public void vegetariano(View v){
        Intent intent= new Intent(this,vegetariano.class);
        startActivity(intent);
    }
}
