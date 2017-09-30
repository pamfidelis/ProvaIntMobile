package br.usjt.tabela_jogos;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Creado por: Pâmela Fidelis
 * RA: 81523345
 **/
public class ListarTimes {

    private Time times [];

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    private static ArrayList<Time> listarTodosTimes(){

        ArrayList<Time> times = new ArrayList<>();
        Time time;

        time = new Time();

        time.setPosicao(1);
        time.setBandeira("");
        time.setNome("Corinthians");
        time.setPontuacao(54);
        time.setJogos(25);
        time.setVitorias(16);
        time.setEmpate(6);
        time.setDerrotas(3);
        time.setGols_marcados(35);
        time.setGols_sofridos(15);
        time.setSaldo_gols(21);
        times.add(time);

        time = new Time();

        time.setPosicao(2);
        time.setBandeira("");
        time.setNome("Santos");
        time.setPontuacao(44);
        time.setJogos(25);
        time.setVitorias(12);
        time.setEmpate(8);
        time.setDerrotas(5);
        time.setGols_marcados(26);
        time.setGols_sofridos(16);
        time.setSaldo_gols(10);
        times.add(time);

        time = new Time();

        time.setPosicao(3);
        time.setBandeira("");
        time.setNome("Grêmio");
        time.setPontuacao(43);
        time.setJogos(25);
        time.setVitorias(13);
        time.setEmpate(4);
        time.setDerrotas(8);
        time.setGols_marcados(40);
        time.setGols_sofridos(22);
        time.setSaldo_gols(18);

        times.add(time);

        time = new Time();

        time.setPosicao(4);
        time.setBandeira("");
        time.setNome("Palmeiras");
        time.setPontuacao(43);
        time.setJogos(25);
        time.setVitorias(13);
        time.setEmpate(4);
        time.setDerrotas(8);
        time.setGols_marcados(36);
        time.setGols_sofridos(26);
        time.setSaldo_gols(10);
        times.add(time);

        time = new Time();

        time.setPosicao(5);
        time.setBandeira("");
        time.setNome("Cruzeiro");
        time.setPontuacao(40);
        time.setJogos(25);
        time.setVitorias(11);
        time.setEmpate(7);
        time.setDerrotas(7);
        time.setGols_marcados(31);
        time.setGols_sofridos(22);
        time.setSaldo_gols(9);
        times.add(time);

        return times;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public static Time[] listarPaises() {
        Time[] lista;
        ArrayList<Time> times = new ArrayList<>();

        for (Time time : listarTodosTimes()) {
                times.add(time);
        }
        lista = times.toArray(new Time[0]);

        return lista;
    }

}
