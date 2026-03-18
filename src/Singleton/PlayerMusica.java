package Singleton;

public class PlayerMusica {

    public void aumentarVolume() {
        ControleVolume.getInstance().aumentar(10);
    }

    public void diminuirVolume() {
        ControleVolume.getInstance().diminuir(10);
    }

    public void mostrarVolume() {
        System.out.println("Volume atual: " + ControleVolume.getInstance().getVolume());
    }
}