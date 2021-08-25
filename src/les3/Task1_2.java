package les3;public class Task1_2{
    public static void main(String[] args) {
        System.out.println(sumEven(435681));
    }

    static int sumEven(int number){
        int lastDigit = -1;
        int sum = 0;
        while(lastDigit != 0){
            lastDigit = number%10;
            if(lastDigit % 2 == 0){
                sum += lastDigit;
            }
            number /= 10;
        }
        return sum;
    }
}
