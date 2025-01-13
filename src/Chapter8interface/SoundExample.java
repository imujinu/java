package src.Chapter8interface;

import src.Section7.C;

public class SoundExample {
    public static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }


    public static void main(String[] args) {
       printSound(new Cat());
        printSound(new Dog());
    }

}
