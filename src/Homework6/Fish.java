package Homework6;

public class Fish extends Domestic{
    public Fish(int id, double weight, int age, String color, String name, boolean isVaccinated) {
        super(id, weight, age, color, name, isVaccinated);
    }

    @Override
    public void voice(){
        System.out.println("........");
    }

    public void thoughts(){
        System.out.println("Unfortunately, I can't speak, but I like listening.");
    }
}
