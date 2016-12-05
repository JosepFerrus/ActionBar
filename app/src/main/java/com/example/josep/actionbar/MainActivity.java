package com.example.josep.actionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.actionbar, menu);
        return super.onCreateOptionsMenu(menu);


    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.buscar:
                Toast.makeText(getApplicationContext(), "BUSCAR", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.guardar:
                Toast.makeText(getApplicationContext(), "guardar", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.editar:
                Toast.makeText(getApplicationContext(), "editar", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.eliminar:
                Toast.makeText(getApplicationContext(), "eliminar", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
