package br.unifei.imc.dispositivos;

public class lampada {

    private String comodo;

    public lampada(){comodo = "Cozinha";}
    public lampada(String comodo){
        this.comodo = comodo;
    }

    public void acender(){
        System.out.println("Lampadam do(a) "  + comodo + " acendendo..");
    }

    public void apagar(){
        System.out.println("Lampadam do(a) "  + comodo + " apagando..");
    }
}
