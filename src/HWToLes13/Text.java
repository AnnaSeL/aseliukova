package HWToLes13;

import java.util.HashMap;
import java.util.Scanner;

public class Text {
    String text;
    public void getText() {
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();
    }

    public void calculate(){
        HashMap<String, Integer> wordsAndAmount = new HashMap<>();
        text = text.toLowerCase();
        String[] mas = text.split(" ");
        int counter = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[i].equals(mas[j])){
                    counter++;
                }
            }
            if(!mas[i].equals(",") && !mas[i].equals(".") && !mas[i].equals(":")) {
                wordsAndAmount.put(mas[i], counter);
            }
            counter = 0;
        }

        System.out.println(wordsAndAmount);
    }

    public static void main(String[] args) {
        Text text = new Text();
        text.getText();
        text.calculate();
    }
}
