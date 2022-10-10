package br.unifei.imc.comando;
import br.unifei.imc.dispositivos.garagem;

public class AbrirGaragem implements Comando{

    garagem g;

    public AbrirGaragem(garagem g){
        this.g = g;
    }
    @Override
    public void executar() {
        g.abrir();
    }
}
