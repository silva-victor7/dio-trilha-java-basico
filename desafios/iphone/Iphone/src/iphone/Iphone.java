package iphone;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.AparelhoMultifuncional;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone {

    public static void main(String[] args) {
        AparelhoMultifuncional funcionalidade = new AparelhoMultifuncional();

        ReprodutorMusical appMusical = funcionalidade;
        AparelhoTelefonico telefone = funcionalidade;
        NavegadorInternet navegar = funcionalidade;

        appMusical.tocar();
        appMusical.pausar();
        appMusical.selecionarMusica();

        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        navegar.exibirPagina();
        navegar.adicionarNovaAba();
        navegar.atualizarPagina();

    }

}
