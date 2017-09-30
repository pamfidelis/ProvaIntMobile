package br.usjt.tabela_jogos;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.lang.reflect.Field;

/**
 * Creado por: Pâmela Fidelis
 * RA: 81523345
 **/

public class Util{

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
        public static Drawable getDrawable(Context context, String nome){

        /* Reflexão */
            Class<?> c = R.drawable.class;
            try {
            /*Atributo da classe */
                Field idField = c.getDeclaredField(nome);
                try {
                    int id = idField.getInt(idField);

                    return context.getResources().getDrawable(id, null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            return null;
        }
}
