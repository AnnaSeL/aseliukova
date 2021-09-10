package Homework6;

public class Hamster extends Domestic{
    public Hamster(int id, double weight, int age, String color, String name, boolean isVaccinated) {
        super(id, weight, age, color, name, isVaccinated);
    }

    @Override
    public String voice(){
        System.out.println(super.voice());
        return super.voice();
    }
}
