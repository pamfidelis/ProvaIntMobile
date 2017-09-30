package br.usjt.tabela_jogos;

import android.widget.ImageView;
import android.widget.TextView;


/**
 * Creado por: Pâmela Fidelis
 * RA: 81523345
 **/
public class ViewHolder {

    TextView posicao;
    ImageView bandeira;
    TextView nome;
    TextView pontuacao;


    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public ViewHolder(TextView posicao, ImageView bandeira, TextView nome, TextView pontuacao) {
        this.posicao = posicao;
        this.bandeira = bandeira;
        this.nome = nome;
        this.pontuacao = pontuacao;
    }


    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public TextView getPosicao() {
        return posicao;
    }


    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public void setPosicao(TextView posicao) {
        this.posicao = posicao;
    }


    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public ImageView getBandeira() {
        return bandeira;
    }


    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public void setBandeira(ImageView bandeira) {
        this.bandeira = bandeira;
    }


    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public TextView getNome() {
        return nome;
    }


    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public void setNome(TextView nome) {
        this.nome = nome;
    }


    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public TextView getPontuacao() {
        return pontuacao;
    }


    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public void setPontuacao(TextView pontuacao) {
        this.pontuacao = pontuacao;
    }
}
