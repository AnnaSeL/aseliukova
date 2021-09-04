package Homework6;

public class Domestic extends Animal{

    private String name;
    private boolean isVaccinated;

    public Domestic(int id, double weight, int age, String color, String name, boolean isVaccinated) {
        super(id, weight, age, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    public void voice(){
        System.out.println("Hello, my name is " + name + ". I am a domestic animal.");
    }

    public void toPet(){
        System.out.println("I like when my owner pets me.");
    }
}
