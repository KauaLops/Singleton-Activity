package Singleton;

import Singleton.ControleVolume;

public class BotaoFisicoVolume {

    public void pressionarMais() {
        ControleVolume.getInstance().aumentar(5);
     }

    public void pressionarMenos() {
        ControleVolume.getInstance().diminuir(5);
    }
}
