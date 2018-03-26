package br.una.aulateste01;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void retornaHelloWorld() {
        String retorno = StringUtils.retornaHelloWorld();

        assertThat(retorno, is("Hello World"));
    }

    @Test
    public void contatenaHelloEWorld(){
        String retorno = StringUtils.concatena("Hello", "World");

        assertThat(retorno, is("Hello World"));
    }

    @Test
    public void contatenaOlaMundo(){
        String retorno = StringUtils.concatena("Ola", "Mundo");

        assertThat(retorno, is("Ola Mundo"));
    }
}
