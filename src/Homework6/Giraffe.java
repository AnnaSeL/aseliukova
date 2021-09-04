package Homework6;

public class Giraffe extends Wild{
    public Giraffe(int id, double weight, int age, String color, boolean isPredator) {
        super(id, weight, age, color, isPredator);
    }

    @Override
    public void voice(){
        System.out.println("Hello. I am a wild animal.");
    }
}
