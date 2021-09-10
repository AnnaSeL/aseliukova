package les5;

public class Calculator {

    static double Calculate(String collocation){
        String[] numbers = collocation.split(" ");
        double result = 0;
        switch (numbers[1]){
            case "+" :
                result = Double.parseDouble(numbers[0]) + Double.parseDouble(numbers[2]);
                break;
            case "-" :
                result = Double.parseDouble(numbers[0]) - Double.parseDouble(numbers[2]);
                break;
            case "/" :
                result = Double.parseDouble(numbers[0]) / Double.parseDouble(numbers[2]);
                break;
            case "*" :
                result = Double.parseDouble(numbers[0]) * Double.parseDouble(numbers[2]);
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Calculate("7 / 8"));
    }

}
