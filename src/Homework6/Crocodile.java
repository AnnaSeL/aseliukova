package Homework6;

public class Crocodile extends Wild{
    public Crocodile(int id, double weight, int age, String color, boolean isPredator) {
        super(id, weight, age, color, isPredator);
    }

    @Override
    public void voice(){
        System.out.println("Hello. I am a wild animal and I am angry.");
    }
}
