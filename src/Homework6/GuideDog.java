package Homework6;

public class GuideDog extends Domestic{

    private boolean isTrained;

    public GuideDog(int id, double weight, int age, String color,
                    String name, boolean isVaccinated, boolean isTrained) {
        super(id, weight, age, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    @Override
    public void voice(){
        if(isTrained == true){
        System.out.println("Hello, my name is " + getName() + ". I am a domestic animal. I can take you home.");
        }else{
            System.out.println("Hello, my name is " + getName() + ". I am a domestic animal.");
        }
    }
}
