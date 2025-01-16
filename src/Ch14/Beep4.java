package src.Ch14;

import src.Section7.B;

import java.awt.*;

public class Beep4 extends Thread {
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }

        }


    }

    public static void main(String[] args) {
        Thread thread = new Beep4();
        thread.start();

        for (int i =0; i<5 ;i++){
            System.out.println("삑");
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }




    }
}
