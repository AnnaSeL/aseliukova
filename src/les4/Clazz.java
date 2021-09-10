package les4;

public class Clazz {
    public static void main(String[] args) {

        long start = 0L;
        long end = 0L;
        int[] array = new int[1_000_000];
        int x = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = 1_000_000_000 + (int) (Math.random() * 1_000_000_000);
        }

        start = System.currentTimeMillis();
        for (int k : array) {
            semEven(k);
        }
        end = System.currentTimeMillis();
        System.out.println("First method time exec : " + (end - start));
    }
        static int semEven(int number){
            int sum = 0;
            String strNum = String.valueOf(number);
            char[] digits = strNum.toCharArray();
            //System.out.println(digits);
            for (char c: digits) {
                if(Integer.parseInt(String.valueOf(c))%2 == 0){
                    sum += Integer.parseInt(String.valueOf(c));
                }
            }
            return sum;
        }

       /* for (int y: array) {
            System.out.println(y);
        }*/
    }

