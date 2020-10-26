package br.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Contato> contatos = new ArrayList<>();
        Contato c = new Contato("Razer", "9999-1010", R.drawable.razer);
        contatos.add(c);
        c = new Contato("Jaime", "9999-2020", R.drawable.jaime);
        contatos.add(c);
        ListView listView = (ListView) findViewById(R.id.lista);
        ContatoAdapter adapter = new ContatoAdapter(contatos, this);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Contato c = (Contato) parent.getItemAtPosition(position);
                clicado(c);
            }
        });
    } // fim do onCreate()
    public void clicado(Contato c) {
        Toast.makeText(this, "Contato Clicado: " + c.getNome(),

                Toast.LENGTH_LONG).show();

    }
}