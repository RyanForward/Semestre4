package br.unifei.imc.controle;

import br.unifei.imc.comando.Comando;

public class apagaLampada implements Comando {

    lampada l;

    public ApagaLampada(lampada l){
        this.l = l;
    }

    @Override
    public void executar() {
        l.apagar();
    }
}
