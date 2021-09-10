package Homework6;

public class Giraffe extends Wild{
    public Giraffe(int id, double weight, int age, String color, boolean isPredator) {
        super(id, weight, age, color, isPredator);
    }

    @Override
    public String voice(){
        System.out.println(super.voice());
        return super.voice();
    }
}
