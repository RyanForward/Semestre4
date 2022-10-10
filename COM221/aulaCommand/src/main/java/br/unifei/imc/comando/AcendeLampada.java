package br.unifei.imc.comando;
import br.unifei.imc.dispositivos.lampada;

public class AcendeLampada implements Comando{

    lampada l;

    public AcendeLampada(lampada l){
        this.l = l;
    }

    @Override
    public void executar() {
        l.acender();
    }
}
