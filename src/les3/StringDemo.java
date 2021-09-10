package les3;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println(isNumberExist("  +(380)976-543-421"));
    }

   /* static boolean isNumberExist(String phoneNumber){
        String existPhoneNumber = "380976543421";
        return phoneNumber == existPhoneNumber;
    }*/

    /*static boolean isNumberExist(String phoneNumber){//if "  +380976543421"
        String existPhoneNumber = "380976543421";
        return existPhoneNumber.equals(phoneNumber.trim().replace("+", ""));
    }*/

    static boolean isNumberExist(String phoneNumber){
        String existPhoneNumber = "380976543421";
        System.out.println(phoneNumber.equals(phoneNumber.trim().replace("^[0-9]", "")) + existPhoneNumber);
        return  false;
    }
}
