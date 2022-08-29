package br.unifei.imc.Inimigo;

public class CavaleiroNegro extends Inimigo{

    public CavaleiroNegro(String nome, double vida, String arma) {
        super(nome, vida, arma);

    }

    @Override
    public void atacar() {
        System.out.println("Cavaleiro Negro atacando!");
    }

    @Override
    public void tomarDano() {
        this.vida -= 5;
    }
}
