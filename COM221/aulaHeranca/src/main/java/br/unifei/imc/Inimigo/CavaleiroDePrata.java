package br.unifei.imc.Inimigo;

public class CavaleiroDePrata extends Inimigo{

    public CavaleiroDePrata(String nome, double vida, String arma) {
        super(nome, vida, arma);
    }

    public void atacar(){
        System.out.println("Cavaleiro de Prata atacando!");
    }

    @Override
    public void tomarDano() {
        this.vida -= 3;
    }
}
