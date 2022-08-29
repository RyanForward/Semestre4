package br.unifei.imc.Inimigo;

public abstract class Inimigo {

    protected String nome;
    protected double vida;
    protected String arma;

    public Inimigo(String nome, double vida, String arma) {
        this.nome = nome;
        this.vida = vida;
        this.arma = arma;
    }

    public abstract void atacar();

    public abstract void tomarDano();

}
