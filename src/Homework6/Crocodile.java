package Homework6;

public class Crocodile extends Wild{
    public Crocodile(int id, double weight, int age, String color, boolean isPredator) {
        super(id, weight, age, color, isPredator);
    }

    @Override
    public String voice(){
        if(isPredator()){
            System.out.println(super.voice() + "I am angry.");
            return (super.voice() + "I am angry.");
        }else{
            System.out.println(super.voice());
            return super.voice();
        }
    }
}
