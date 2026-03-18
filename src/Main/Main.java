package Main;

import Singleton.Alarme;
import Singleton.BotaoFisicoVolume;
import Singleton.ControleVolume;
import Singleton.PlayerMusica;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== TESTE 1 - MESMA INSTÂNCIA ===");
        ControleVolume a = ControleVolume.getInstance();
        ControleVolume b = ControleVolume.getInstance();
        System.out.println("Mesma instância? " + (a == b));

        System.out.println("\n=== TESTE 2 - ESTADO COMPARTILHADO ===");
        BotaoFisicoVolume botao = new BotaoFisicoVolume();
        PlayerMusica player = new PlayerMusica();
        Alarme alarme = new Alarme();

        System.out.println("Volume inicial: ");
        player.mostrarVolume();

        botao.pressionarMais();
        botao.pressionarMais();

        System.out.println("Volume após apertar + duas vezes:");
        player.mostrarVolume();

        System.out.println("\n=== TESTE 3 - ALARME FORÇA O VOLUME ===");
        alarme.tocar();
        System.out.println("Volume visto pelo player:");
        player.mostrarVolume();

        System.out.println("\n=== TESTE 4 - MUTE E LIMITES ===");
        ControleVolume.getInstance().mutar();
        System.out.println("Após mutar:");
        player.mostrarVolume();

        ControleVolume.getInstance().setVolume(95);
        botao.pressionarMais();
        botao.pressionarMais();

        System.out.println("Após testar limite superior:");
        player.mostrarVolume();
    }
}
