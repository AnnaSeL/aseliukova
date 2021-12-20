package HWToLes15;

import java.util.HashMap;
import java.util.Map;

public class LoginUtil {
    private static Map<String, String> loginData = new HashMap<>();
    static{
        loginData.put("whiteOcean", "bkjfduus67");
        loginData.put("drakula", "kjkljfs2332");
        loginData.put("ironMan", "fdjcec2345");
        loginData.put("Joker", "frefcv666");
        loginData.put("mathew", "ejcfce4r334");
    }

    static boolean isUserAuthentic(String login, String password, String confirmPassword){
        try {
            isLoginValid(login);
            isPasswordValid(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException exception){
            System.out.println(exception.getMessage());
            return false;
        }
        if (loginData.containsKey(login)){
            if(loginData.get(login).equals(password)) {
                return true;
            }
        }
        System.out.println("Login or password doesn't match.");
        return false;
    }

    private static void isPasswordValid(String password, String confirmPassword) throws WrongPasswordException{
        if(!(password.matches("^[a-zA-Z0-9|_]+$") && password.length()<20)){
            throw new WrongPasswordException("Password is incorrect.");
        }else if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("Confirm password is incorrect.");
        }
    }

    private static void isLoginValid(String login) throws WrongLoginException{
        if(!(login.matches("^[a-zA-Z0-9|_]+$") && login.length()<20 && loginData.containsKey(login))){
            throw new WrongLoginException("Login is incorrect");
        }
    }
}
