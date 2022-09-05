package br.unifei.imc;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {

    @Getter
    private int tam;
    private List<T> elementos;

    public Pilha(){
        elementos = new ArrayList<>();
    }

    public boolean isVazia() {

        return tam==0;

    }

    public void push(T elemento) {
        elementos.add(elemento);
        tam++;
    }

    public T mostraTopo() {
        T elemento = elementos.get(tam-1);
        return elemento;
    }

    public void pop() {
        if(!isVazia())
            elementos.remove(--tam);
        else
            throw new PilhaVaziaException();
    }

}
