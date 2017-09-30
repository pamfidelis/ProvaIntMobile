package br.usjt.tabela_jogos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Creado por: Pâmela Fidelis
 * RA: 81523345
 *
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     *
     */

    ListView listView;
    Time[] times;
    ListarTimes lista;
    TimesAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listar_jogos);

        times = lista.listarPaises();

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), DetalheTimeActivity.class);
                intent.putExtra("id", id);

                startActivity(intent);
            }
        });
    }
}
