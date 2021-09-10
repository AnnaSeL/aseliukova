package Homework6;

public class Dog extends Domestic{
    public Dog(int id, double weight, int age, String color, String name, boolean isVaccinated) {
        super(id, weight, age, color, name, isVaccinated);
    }

    @Override
    public String voice(){
        System.out.println(super.voice() + " Woof!");
        return super.voice() + " Woof!";
    }

    public void swim(){
        System.out.println("I can swim.");
    }
}
