package Homework6;

public class Lion extends Wild{
    public Lion(int id, double weight, int age, String color, boolean isPredator) {
        super(id, weight, age, color, isPredator);
    }

    @Override
    public void voice(){
        System.out.println("Hello. I am a wild animal and I am angry.");
    }
}
