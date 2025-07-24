package application;

import entities.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando reprodutor musical
        meuIphone.selecionarMusica("BLUE - Billie Eillish");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando aparelho telefônico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando navegador
        meuIphone.exibirPagina("https://www.github.com/drewgdev");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
