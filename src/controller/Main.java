package controller;

import model.Client;
import view.ControlPanel;
import java.util.Random;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        //insertRandom();
        new ControlPanel().setVisible(true);
    }
    
    private static void insertRandom() {
        for (int i = 0; i < 350; i++) {
            int s = new Random().nextInt(1000) + i;
            new Recorder(new Client("TESTE_" + s, "teste_" + s + "@gmail.com"))
                    .createClientRegister();   
        }
    }
}