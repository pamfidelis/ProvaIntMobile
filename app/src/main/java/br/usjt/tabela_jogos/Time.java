package br.usjt.tabela_jogos;

/**
 * Creado por: Pâmela Fidelis
 * RA: 81523345
 *
 */

public class Time {

    private int posicao;
    private String bandeira;
    private String nome;
    private int pontuacao;
    private int jogos;
    private int vitorias;
    private int empates;
    private int empate;
    private int derrotas;
    private int gols_marcados;
    private int gols_sofridos;
    private int saldo_gols;

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     *
     */
    public Time(int jogos, int vitorias, int empates, int empate,
                    int derrotas, int gols_marcados, int gols_sofridos, int saldo_gols) {
        this.jogos = jogos;
        this.vitorias = vitorias;
        this.empates = empates;
        this.empate = empate;
        this.derrotas = derrotas;
        this.gols_marcados = gols_marcados;
        this.gols_sofridos = gols_sofridos;
        this.saldo_gols = saldo_gols;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/

    public Time() {
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public int getPosicao() {
        return posicao;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public String getBandeira() {
        return bandeira;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public String getNome() {
        return nome;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public int getPontuacao() {
        return pontuacao;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public int getJogos() {
        return jogos;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public void setJogos(int jogos) {
        this.jogos = jogos;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public int getVitorias() {
        return vitorias;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public int getEmpates() {
        return empates;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public int getEmpate() {
        return empate;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public void setEmpate(int empate) {
        this.empate = empate;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public int getDerrotas() {
        return derrotas;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public int getGols_marcados() {
        return gols_marcados;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
      public void setGols_marcados(int gols_marcados) {
        this.gols_marcados = gols_marcados;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public int getGols_sofridos() {
        return gols_sofridos;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public void setGols_sofridos(int gols_sofridos) {
        this.gols_sofridos = gols_sofridos;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public int getSaldo_gols() {
        return saldo_gols;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/
    public void setSaldo_gols(int saldo_gols) {
        this.saldo_gols = saldo_gols;
    }

    /**
     * Creado por: Pâmela Fidelis
     * RA: 81523345
     **/

    @Override
    public String toString() {
        return "Time{" +
                "posicao=" + posicao +
                ", bandeira='" + bandeira + '\'' +
                ", nome='" + nome + '\'' +
                ", pontuacao=" + pontuacao +
                ", jogos=" + jogos +
                ", vitorias=" + vitorias +
                ", empates=" + empates +
                ", empate=" + empate +
                ", derrotas=" + derrotas +
                ", gols_marcados=" + gols_marcados +
                ", gols_sofridos=" + gols_sofridos +
                ", saldo_gols=" + saldo_gols +
                '}';
    }
}
