package Homework6;

public class Cat extends Domestic{

    public Cat(int id, double weight, int age, String color, String name, boolean isVaccinated) {
        super(id, weight, age, color, name, isVaccinated);
    }

    @Override
    public String voice(){
        System.out.println(super.voice() + " Meow!");
        return (super.voice() + " Meow!");
    }

    public void play(){
        System.out.println("I like catching mice!");
    }
}
