package br.unifei.imc;
import br.unifei.imc.comando.AbrirGaragem;
import br.unifei.imc.comando.AcendeLampada;
import br.unifei.imc.controle.lampada;
import br.unifei.imc.dispositivos.garagem;

public class Main {
    public static void main(String[] args) {
        lampada c = new lampada(5);

        AbrirGaragem ag = new AbrirGaragem(new garagem());
        AcendeLampada al = new AcendeLampada(new br.unifei.imc.dispositivos.lampada());
        AcendeLampada ali = new AcendeLampada(new br.unifei.imc.dispositivos.lampada("Quarto"));

        c.setComando(1, ag);
        c.apertarBtn(1);

        c.setComando(2, al);
        c.apertarBtn(2);

        c.setComando(3, ali);
        c.apertarBtn(3);

    }
}