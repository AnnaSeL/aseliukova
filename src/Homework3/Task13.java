package Homework3;

public class Task13 {
    public static void main(String[] args) {
        String[][] desk = new String[8][8];

        for (int i = 0; i < desk.length; i++) {
            for (int j = 0; j < desk[i].length; j++) {
                if(i%2==0 && j%2==0 || i%2!=0 && j%2!=0){
                    desk[i][j] = "B";
                }else{
                    desk[i][j] = "W";
                }
                System.out.print(desk[i][j] + " ");
            }
            System.out.println();
        }
    }
}
