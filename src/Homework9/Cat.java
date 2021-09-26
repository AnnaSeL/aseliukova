package Homework9;

import Homework9.Interfaces.Play;
import Homework9.Interfaces.Voice;

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
