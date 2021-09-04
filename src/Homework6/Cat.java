package Homework6;

public class Cat extends Domestic{

    public Cat(int id, double weight, int age, String color, String name, boolean isVaccinated) {
        super(id, weight, age, color, name, isVaccinated);
    }

    @Override
    public void voice(){
        System.out.println("Hello, my name is " + getName() + ". I am a domestic animal. Meow!");
    }

    public void play(){
        System.out.println("I like catching mice!");
    }
}
