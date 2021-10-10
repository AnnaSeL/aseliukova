package Homework8;

import Homework8.Interfaces.Think;
import Homework8.Interfaces.Voice;

public class Fish extends Domestic implements Voice, Think {
    public Fish(int id, double weight, int age, String color, String name, boolean isVaccinated) {
        super(id, weight, age, color, name, isVaccinated);
    }

    @Override
    public void printVoice(){
        System.out.println("........");
    }
}
