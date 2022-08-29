package br.unifei.imc;

import br.unifei.imc.Inimigo.CavaleiroNegro;
import br.unifei.imc.Inimigo.Inimigo;
import br.unifei.imc.Inimigo.Zumbilerdo;
import br.unifei.imc.Jogador.Jogador;

public class main {

    public static void main(String[] args) {

        Inimigo z = new Zumbilerdo("Jonatan", 200, "Teclado");
        Inimigo c = new CavaleiroNegro("Pedro", 500, "Machado de perna");
        Jogador j = new Jogador("Pedro", 450);

        z.atacar();
        c.atacar();
    }




}
