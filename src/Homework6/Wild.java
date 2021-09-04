package Homework6;

public class Wild extends Animal{

    private boolean isPredator;

    public Wild(int id, double weight, int age, String color, boolean isPredator) {
        super(id, weight, age, color);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    @Override
    public void voice(){
        System.out.println("Hello. I am a wild animal.");
    }
}
