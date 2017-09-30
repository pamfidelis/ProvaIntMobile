package br.usjt.tabela_jogos;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Creado por: Pâmela Fidelis
 * RA: 81523345
 **/

public class TimesAdapter extends BaseAdapter {

    Time [] times;
    Activity activity;

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public TimesAdapter(Time[] times, Activity activity) {
        this.times = times;
        this.activity = activity;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/

    @Override
    public int getCount() {
        return times.length;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    @Override
    public Object getItem(int posicao) {
        return times[posicao];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/

    @Override
    public View getView(int posicao, View convertView, ViewGroup parent) {

        View view = convertView;

        if (view == null){
            view =    activity.getLayoutInflater().inflate(R.layout.linha_time, parent, false);

            ImageView bandeira = (ImageView) view.findViewById(R.id.bandeira);
            TextView nome = (TextView) view.findViewById(R.id.nome_time);
            TextView txt_posicao = (TextView) view.findViewById(R.id.posicao);
            TextView txt_ponntuacao = (TextView) view.findViewById(R.id.pontuacao);


            ViewHolder viewHolder = new ViewHolder(txt_posicao, bandeira, nome, txt_ponntuacao);

            view.setTag(viewHolder);
        }

        ViewHolder viewHolder = (ViewHolder) view.getTag();

        viewHolder.getNome().setText(times[posicao].getNome());
        viewHolder.getPosicao().setText(times[posicao].getPosicao());
        viewHolder.getPontuacao().setText(times[posicao].getPontuacao());

        Drawable drawable =  Util.getDrawable(activity, "ic_" + times[posicao].getBandeira().toLowerCase());
        if(drawable == null){
            drawable = activity.getDrawable(R.drawable.bandeira);
        }
        viewHolder.getBandeira().setImageDrawable(drawable);

        return view;
    }
}
