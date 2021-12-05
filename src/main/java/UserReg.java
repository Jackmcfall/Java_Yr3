public class UserReg {
    String password = "hi";
    String email = "hello";
    String p = "^(?=.{7,})(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@^&!]).*$";
    String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

    public boolean passwordIsValid(){
        if (!password.matches(p)){
            throw new IllegalArgumentException(password);
        }
        return false;
    }

    public boolean emailIsValid(){
        if (!email.matches(regex)){
            throw new IllegalArgumentException(email);
        }

        return true;
    }


    }
