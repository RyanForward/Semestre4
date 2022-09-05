package br.unifei.imc.test;

import br.unifei.imc.Pilha;
import br.unifei.imc.PilhaVaziaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestePilha {

    Pilha pilha;

    @Before
    public void setup(){
        pilha = new Pilha<Integer>();
    }

    @Test
    public void testePilhaVazia(){
        boolean retorno = pilha.isVazia();
        Assert.assertTrue(retorno);
    }

    @Test
    public void testePush2Elementos(){
        pilha.push(2);
        pilha.push(3);
        int tam = pilha.getTam();
        Assert.assertEquals(2, tam);
        int topo = (int)pilha.mostraTopo();
        Assert.assertEquals(3, topo);
    }

    public void testePop(){
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.pop();
        int tam = pilha.getTam();
        int topo = (int)pilha.mostraTopo();

        Assert.assertEquals(2, tam);
        Assert.assertEquals(3, topo);

    }

    @Test(expected = PilhaVaziaException.class)
    public void testePopPilhaVazia(){
        pilha.pop();
    }

}
