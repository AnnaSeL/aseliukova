package les3;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(semEven(435681));
    }

    static int semEven(int number){
        int sum = 0;
        String strNum = String.valueOf(number);
        char[] digits = strNum.toCharArray();
        System.out.println(digits);

        for (char c: digits) {
            if(Integer.parseInt(String.valueOf(c))%2 == 0){
                sum += Integer.parseInt(String.valueOf(c));
            }
        }

        return sum;
    }
}
