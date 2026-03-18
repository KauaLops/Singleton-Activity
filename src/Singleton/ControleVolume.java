package Singleton;

public class ControleVolume {

    private static final ControleVolume INSTANCE = new ControleVolume();

    private int volume;

    private ControleVolume() {
        this.volume = 50;
    }

    public static ControleVolume getInstance() {
        return INSTANCE;
    }

    public int getVolume() {
        return volume;
    }

    public void aumentar(int passo) {
        if (passo <= 0) {
            throw new IllegalArgumentException("Passo deve ser > 0");
        }

        volume += passo;

        if (volume > 100) {
            volume = 100;
        }
    }

    public void diminuir(int passo) {
        if (passo <= 0) {
            throw new IllegalArgumentException("Passo deve ser > 0");
        }

        volume -= passo;

        if (volume < 0) {
            volume = 0;
        }
    }

    public void mutar() {
        volume = 0;
    }

    public void setVolume(int novoVolume) {
        if (novoVolume < 0) {
            volume = 0;
        } else if (novoVolume > 100) {
            volume = 100;
        } else {
            volume = novoVolume;
        }
    }
}
