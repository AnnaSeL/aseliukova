package Homework6;

public class Hamster extends Domestic{
    public Hamster(int id, double weight, int age, String color, String name, boolean isVaccinated) {
        super(id, weight, age, color, name, isVaccinated);
    }

    @Override
    public void voice(){
        System.out.println("Hello, my name is " + getName() + ". I am a domestic animal.");
    }
}
