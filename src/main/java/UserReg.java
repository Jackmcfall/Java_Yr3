public class UserReg {
    String password = "hi";
    String p = "^(?=.{7,})(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@^&!]).*$";
    String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

    public boolean passwordIsValid(){
        if (!password.matches(p)){
            throw new IllegalArgumentException(password);
        }
        return false;
    }


    }
