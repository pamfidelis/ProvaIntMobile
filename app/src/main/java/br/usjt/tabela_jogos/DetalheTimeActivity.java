package br.usjt.tabela_jogos;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Creado por: Pâmela Fidelis
 * RA: 81523345
 *
 */
public class DetalheTimeActivity extends AppCompatActivity {

    private TextView txtDetalhe;
    private TextView posicao;
    private TextView nome;
    private ImageView bandeira;

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_time);


        Intent intent = getIntent();

        Time time = (Time)intent.getSerializableExtra("time");

        posicao = (TextView) findViewById(R.id.posicao);
        txtDetalhe.setText(time.getPosicao());

        nome = (TextView) findViewById(R.id.nome_time);
        nome.setText(time.getNome());

        bandeira = (ImageView) findViewById(R.id.bandeira);

       // Drawable drawable =  Util.getDrawable(getApplicationContext(), "ic_" + time[posicao].getBandeira().toLowerCase());

        txtDetalhe = (TextView) findViewById(R.id.detalhe);
        txtDetalhe.setText(time.toString());
    }
}
