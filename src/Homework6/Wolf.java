package Homework6;

public class Wolf extends Wild{

    public Wolf(int id, double weight, int age, String color, boolean isPredator) {
        super(id, weight, age, color, isPredator);
    }

    @Override
    public void voice(){
        System.out.println("Hello. I am a wild animal and I am angry.");
    }

    public void howl(){
        System.out.println("I like howl at the moon.");
    }
}
