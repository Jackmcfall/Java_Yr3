import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegTest{
    @Test
    public void passwordIsValidTest(){
        UserReg test = new UserReg();
        assertThrows(IllegalArgumentException.class, test::passwordIsValid);
    }

    @Test
    public void emailIsValidTest(){
        UserReg test = new UserReg();
        assertThrows(IllegalArgumentException.class, test::emailIsValid);
    }


}