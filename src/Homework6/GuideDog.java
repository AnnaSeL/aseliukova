package Homework6;

public class GuideDog extends Dog{

    private boolean isTrained;

    public GuideDog(int id, double weight, int age, String color,
                    String name, boolean isVaccinated, boolean isTrained) {
        super(id, weight, age, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    @Override
    public String voice(){
        System.out.println("Hello! My name is " + getName() + ". I am a domestic animal. Woof!");
        return "Hello! My name is " + getName() + ". I am a domestic animal. Woof!";
    }

    public void takeHome(){
        if(isTrained){
            System.out.println("I can take you home.");
        }else{
            System.out.println("I am not trained yet.");
        }
    }

    @Override
    public void swim(){
        if(isTrained){
            System.out.println("I even can swim with my owner.");
        }else{
            System.out.println("I am not trained for swimming yet.");
        }
    }


}
