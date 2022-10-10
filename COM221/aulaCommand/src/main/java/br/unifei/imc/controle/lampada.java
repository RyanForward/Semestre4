package br.unifei.imc.controle;
import br.unifei.imc.comando.Comando;
import br.unifei.imc.NullComand;

import java.util.ArrayList;
import java.util.List;

public class lampada {

    private List<Comando> comandosLigar;
    private List<Comando> comandosDesligar;

    public lampada(int qtdBtn){
        comandosLigar = new ArrayList<>();
        comandosDesligar = new ArrayList<>();
        for(int i=0; i<qtdBtn; i++){
            comandosLigar.add(new NullComand());
            comandosDesligar.add(new NullComand());
        }
    }

    public void apertarBtnLiga(int slot){
        comandosLigar.get(slot).executar();
    }
    public void apertarBtnDesligar(int slot){
        comandosDesligar.get(slot).executar();
    }

    public void setComando(int slot, Comando comandoLigar, Comando comandoDesligar){
        comandosLigar.add(slot, comandoLigar);
        comandosDesligar.add(slot, comandoDesligar);
        }

}
