package Homework9.Interfaces;

public interface Voice {

    default void printVoice(){
        System.out.println("Hello! ");
    }

    default void specificVoice(){}
}
