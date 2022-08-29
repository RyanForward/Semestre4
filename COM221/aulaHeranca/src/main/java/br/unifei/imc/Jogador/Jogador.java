package br.unifei.imc.Jogador;

import br.unifei.imc.Inimigo.CavaleiroNegro;
import br.unifei.imc.Inimigo.Inimigo;

public class Jogador {
    private String nome;
    private double vida;

    public Jogador(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(Inimigo ini){
        ini.tomarDano();
        System.out.println("Jogador atacou!");
    }
}


