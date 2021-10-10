package Homework8;

import Homework8.Interfaces.Play;
import Homework8.Interfaces.Voice;

public class Cat extends Domestic implements Voice, Play {

    public Cat(int id, double weight, int age, String color, String name, boolean isVaccinated) {
        super(id, weight, age, color, name, isVaccinated);
    }

    @Override
    public void specificVoice(){
        System.out.println(" Meow!");
    }

    @Override
    public void toPlay(){
        System.out.println("I like catching mice!");
    }
}
