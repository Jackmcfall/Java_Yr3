import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegTest{
    /**
     * test method that checks to see if password is valid
     * creates new instance of UserReg
     * tests passwordIsValid method in UserReg class
     */
    @Test
    public void passwordIsValidTest(){
        UserReg test = new UserReg();
        assertThrows(IllegalArgumentException.class, test::passwordIsValid);
    }

    /**
     * test method that checks to see if email is well formed
     * creates new instance of UserReg
     * tests emailIsValid method in UserReg class
     */

    @Test
    public void emailIsValidTest(){
        UserReg test = new UserReg();
        assertThrows(IllegalArgumentException.class, test::emailIsValid);
    }


}