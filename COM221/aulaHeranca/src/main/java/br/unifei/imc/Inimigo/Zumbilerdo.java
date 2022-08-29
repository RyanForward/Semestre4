package br.unifei.imc.Inimigo;

public class Zumbilerdo extends Inimigo{

    public Zumbilerdo(String nome, double vida, String arma) {
        super(nome, vida, arma);
    }

    public void atacar(){
        System.out.println("Zumbi lerdo atacando");
    }

    @Override
    public void tomarDano() {
        this.vida -= 20;
    }
}
