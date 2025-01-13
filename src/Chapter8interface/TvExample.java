package src.Chapter8interface;

import src.Section7.A;

public class TvExample {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        RemoteControl lc = new Audio();

        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        lc.turnOn();
        lc.setVolume(5);
        lc.turnOff();
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);
    }
}
